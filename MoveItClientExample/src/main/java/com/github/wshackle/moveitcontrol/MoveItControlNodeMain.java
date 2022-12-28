/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.github.wshackle.moveitcontrol;

import actionlib_msgs.GoalID;
import static com.github.wshackle.moveitcontrol.MoveItControlJFrame.startMoveItControlJFrame;
import geometry_msgs.Pose;
import geometry_msgs.PoseStamped;
import geometry_msgs.Vector3;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import moveit_msgs.Constraints;
import moveit_msgs.GetPositionFKRequest;
import moveit_msgs.GetPositionFKResponse;
import moveit_msgs.GetPositionIKRequest;
import moveit_msgs.GetPositionIKResponse;
import moveit_msgs.JointConstraint;
import moveit_msgs.MotionPlanRequest;
import moveit_msgs.MoveGroupActionGoal;
import moveit_msgs.MoveItErrorCodes;
import moveit_msgs.RobotState;
import moveit_msgs.WorkspaceParameters;
import org.apache.commons.logging.Log;
import org.ros.exception.RemoteException;
import org.ros.exception.RosRuntimeException;
import org.ros.exception.ServiceNotFoundException;
import org.ros.message.MessageFactory;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.service.ServiceClient;
import org.ros.node.service.ServiceResponseListener;
import org.ros.node.topic.Publisher;
import org.ros.node.topic.Subscriber;
import sensor_msgs.JointState;

/**
 *
 * @author Will Shackleford<william.shackleford@nist.gov>
 */
public class MoveItControlNodeMain extends AbstractNodeMain {

    @Override
    public GraphName getDefaultNodeName() {
        return GraphName.of(MoveItControlNodeMain.class.getCanonicalName().replace('.', '/'));
    }

    private Log log;
    private ServiceClient<moveit_msgs.GetPositionIKRequest, moveit_msgs.GetPositionIKResponse> computeIkServiceCLient;
    private ServiceClient<moveit_msgs.GetPositionFKRequest, moveit_msgs.GetPositionFKResponse> computeFkServiceCLient;
    private ConnectedNode connectedNode;
    private Subscriber<sensor_msgs.JointState> jointStateSubscriber;
    private Publisher<moveit_msgs.MoveGroupActionGoal> moveRequestPublisher;

    public Log getLog() {
        return log;
    }

    public ServiceClient<GetPositionIKRequest, GetPositionIKResponse> getComputeIkServiceCLient() {
        return computeIkServiceCLient;
    }

    public ConnectedNode getConnectedNode() {
        return connectedNode;
    }

    public Subscriber<JointState> getJointStateSubscriber() {
        return jointStateSubscriber;
    }

    public Publisher<MoveGroupActionGoal> getMoveRequestPublisher() {
        return moveRequestPublisher;
    }

    public static CompletableFuture<MoveItControlNodeMain> getFutureMoveItControlNodeMain() {
        return futureMoveItControlNodeMain;
    }

    public ServiceClient<GetPositionFKRequest, GetPositionFKResponse> getComputeFkServiceCLient() {
        return computeFkServiceCLient;
    }

    @Override
    public void onStart(ConnectedNode connectedNode) {
        try {
            this.connectedNode = connectedNode;
            this.topicMessageFactory = connectedNode.getTopicMessageFactory();
            this.log = connectedNode.getLog();
            this.computeIkServiceCLient = connectedNode.newServiceClient("compute_ik", moveit_msgs.GetPositionIK._TYPE);
            this.computeFkServiceCLient = connectedNode.newServiceClient("compute_fk", moveit_msgs.GetPositionFK._TYPE);
            this.moveRequestPublisher
                    = connectedNode.newPublisher("move_group/goal", moveit_msgs.MoveGroupActionGoal._TYPE);

            this.jointStateSubscriber = connectedNode.newSubscriber("joint_states", sensor_msgs.JointState._TYPE);
            futureMoveItControlNodeMain.complete(this);
        } catch (ServiceNotFoundException e) {
            throw new RosRuntimeException(e);
        }
    }

    public Pose newPose() {
        return topicMessageFactory.newFromType(Pose._TYPE);
    }
    private MessageFactory topicMessageFactory;

    public void gotoPose(Pose newGoalPose) {
        final moveit_msgs.GetPositionIKRequest getPositionIKrequest
                = computeIkServiceCLient.newMessage();
        moveit_msgs.PositionIKRequest posIKRequest = getPositionIKrequest.getIkRequest();
        geometry_msgs.PoseStamped poseStamped = posIKRequest.getPoseStamped();
        poseStamped.setPose(newGoalPose);
        posIKRequest.setGroupName(moveItGroupName);
        getPositionIKrequest.setIkRequest(posIKRequest);
        computeIkServiceCLient.call(getPositionIKrequest, new ServiceResponseListener<moveit_msgs.GetPositionIKResponse>() {
            @Override
            public void onSuccess(moveit_msgs.GetPositionIKResponse response) {
                final Log log1 = connectedNode.getLog();
                StringBuilder sb = new StringBuilder();
                final MoveItErrorCodes errorCode = response.getErrorCode();
                log1.info("errorCode=" + errorCode.getVal());
                final RobotState solution = response.getSolution();
                final JointState solutionJointState = solution.getJointState();
                final double[] solutionJointPositions = solutionJointState.getPosition();
                final List<String> solutionJointNames = solutionJointState.getName();
                sb.append("\n");
                for (int i = 0; i < solutionJointPositions.length && i < solutionJointNames.size(); i++) {
                    double positioni = solutionJointPositions[i];
                    final String namei = solutionJointNames.get(i);
                    sb.append("    solution_joint_position.position[").append(i).append("=").append(namei).append("] =").append(positioni).append("\n");
                }
                log1.info(sb.toString());
                gotoJointPositions(solutionJointPositions, solutionJointNames);
            }

            @Override
            public void onFailure(RemoteException e) {
                throw new RosRuntimeException(e);
            }
        });

    }

    public CompletableFuture<Pose> callForwardKinematicsService(JointState jointState) {
        CompletableFuture<Pose> futurePose = new CompletableFuture<>();
        final GetPositionFKRequest computeFKServiceRequest
                = this.getComputeFkServiceCLient().newMessage();
        computeFKServiceRequest.getRobotState().setJointState(jointState);
        computeFKServiceRequest.getFkLinkNames().add(lastLinkName);
        this.getComputeFkServiceCLient().call(computeFKServiceRequest,
                new ServiceResponseListener<GetPositionFKResponse>() {
            @Override
            public void onSuccess(GetPositionFKResponse response) {
                final List<String> fkLinkNames = response.getFkLinkNames();
                final List<PoseStamped> stampedPosesList = response.getPoseStamped();
                if (stampedPosesList.size() != 1) {
                    throw new RuntimeException("stampedPosesList as size of " + stampedPosesList.size() + " which should be 1.");
                }
                final Pose pose = stampedPosesList.get(0).getPose();
                futurePose.complete(pose);
            }

            @Override
            public void onFailure(RemoteException e) {
                futurePose.completeExceptionally(e);
            }
        });
        return futurePose;
    }
    
    private String workspaceFrameId = System.getProperty("moveitcontrol.workspaceFrameId","panda_link0");
    private String moveItGroupName = System.getProperty("moveitcontrol.moveitGroupName","panda_arm");

    private String lastLinkName = System.getProperty("moveitcontrol.lastLinkName","panda_link8");

    public String getLastLinkName() {
        return lastLinkName;
    }

    public void setLastLinkName(String lastLinkName) {
        this.lastLinkName = lastLinkName;
    }
    
    

    public void gotoJointPositions(final double[] goalJointPositions, final List<String> goalJointNames) {
        final MoveGroupActionGoal moveGoal = moveRequestPublisher.newMessage();
        final GoalID goalId = moveGoal.getGoalId();
        goalId.setId(MoveItControlNodeMain.class.getCanonicalName() + System.currentTimeMillis());
        final MotionPlanRequest moveRequest = moveGoal.getGoal().getRequest();
        final WorkspaceParameters workspaceParameters = moveRequest.getWorkspaceParameters();
        final Vector3 maxCorner = workspaceParameters.getMaxCorner();
        maxCorner.setX(1.0);
        maxCorner.setY(1.0);
        maxCorner.setZ(1.0);
        final Vector3 minCorner = workspaceParameters.getMinCorner();
        minCorner.setX(-1.0);
        minCorner.setY(-1.0);
        minCorner.setZ(-1.0);
        workspaceParameters.getHeader().setFrameId(workspaceFrameId);
        moveRequest.setGroupName(moveItGroupName);
//                        moveRequest.getStartState().setJointState(currentJointState);
        final List<Constraints> goalConstraints = moveRequest.getGoalConstraints();
        Constraints constraints = topicMessageFactory.newFromType(Constraints._TYPE);
        final List<JointConstraint> jointConstraints = constraints.getJointConstraints();
        for (int i = 0; i < goalJointPositions.length && i < goalJointNames.size(); i++) {
            double positioni = goalJointPositions[i];
            final String namei = goalJointNames.get(i);

            JointConstraint jointConstraint = topicMessageFactory.newFromType(JointConstraint._TYPE);
            jointConstraint.setJointName(namei);
            jointConstraint.setPosition(positioni);
            jointConstraint.setToleranceAbove(0.0001);
            jointConstraint.setToleranceBelow(0.0001);
            jointConstraint.setWeight(1.0);
            jointConstraints.add(jointConstraint);
        }
        goalConstraints.add(constraints);
        moveRequestPublisher.publish(moveGoal);
        System.out.println("published newGoal");
    }
    
    public String getWorkspaceFrameId() {
        return workspaceFrameId;
    }

    public void setWorkspaceFrameId(String workspaceFrameId) {
        this.workspaceFrameId = workspaceFrameId;
    }

    public String getMoveItGroupName() {
        return moveItGroupName;
    }

    public void setMoveItGroupName(String moveItGroupName) {
        this.moveItGroupName = moveItGroupName;
    }

    private static final CompletableFuture<MoveItControlNodeMain> futureMoveItControlNodeMain = new CompletableFuture<>();

    public static void main(String[] args) throws Exception {
        futureMoveItControlNodeMain.thenAccept((MoveItControlNodeMain moveItControlNodeMain) -> {
            startMoveItControlJFrame(moveItControlNodeMain);
        });
        org.ros.RosRun.main(new String[]{MoveItControlNodeMain.class.getCanonicalName()});
    }

    
}
