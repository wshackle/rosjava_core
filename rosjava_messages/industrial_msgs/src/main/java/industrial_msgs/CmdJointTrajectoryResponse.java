package industrial_msgs;

public interface CmdJointTrajectoryResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/CmdJointTrajectoryResponse";
  static final java.lang.String _DEFINITION = "industrial_msgs/ServiceReturnCode code";
  industrial_msgs.ServiceReturnCode getCode();
  void setCode(industrial_msgs.ServiceReturnCode value);
}
