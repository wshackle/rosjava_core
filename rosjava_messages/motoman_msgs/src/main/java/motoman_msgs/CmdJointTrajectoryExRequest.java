package motoman_msgs;

public interface CmdJointTrajectoryExRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/CmdJointTrajectoryExRequest";
  static final java.lang.String _DEFINITION = "\n\nmotoman_msgs/DynamicJointTrajectory trajectory\n";
  motoman_msgs.DynamicJointTrajectory getTrajectory();
  void setTrajectory(motoman_msgs.DynamicJointTrajectory value);
}
