package industrial_msgs;

public interface CmdJointTrajectory extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/CmdJointTrajectory";
  static final java.lang.String _DEFINITION = "# Send a JointTrajectory command to the robot.\n#   - duplicates functionality of the joint_path_command topic\n#   - provides a response-code to verify command was received\n#   - returns when trajectory is sent to robot, not when motion completed\n#   - return code may NOT indicate successful transfer to robot\n\ntrajectory_msgs/JointTrajectory trajectory\n---\nindustrial_msgs/ServiceReturnCode code\n";
}
