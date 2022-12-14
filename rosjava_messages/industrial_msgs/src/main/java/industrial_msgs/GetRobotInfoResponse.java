package industrial_msgs;

public interface GetRobotInfoResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/GetRobotInfoResponse";
  static final java.lang.String _DEFINITION = "industrial_msgs/DeviceInfo controller\nindustrial_msgs/DeviceInfo[] robots\nindustrial_msgs/ServiceReturnCode code";
  industrial_msgs.DeviceInfo getController();
  void setController(industrial_msgs.DeviceInfo value);
  java.util.List<industrial_msgs.DeviceInfo> getRobots();
  void setRobots(java.util.List<industrial_msgs.DeviceInfo> value);
  industrial_msgs.ServiceReturnCode getCode();
  void setCode(industrial_msgs.ServiceReturnCode value);
}
