package motoman_msgs;

public interface CmdJointTrajectoryExResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/CmdJointTrajectoryExResponse";
  static final java.lang.String _DEFINITION = "industrial_msgs/ServiceReturnCode code";
  industrial_msgs.ServiceReturnCode getCode();
  void setCode(industrial_msgs.ServiceReturnCode value);
}
