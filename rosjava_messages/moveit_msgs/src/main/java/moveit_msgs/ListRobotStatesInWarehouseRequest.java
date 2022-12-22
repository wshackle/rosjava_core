package moveit_msgs;

public interface ListRobotStatesInWarehouseRequest {
  static final java.lang.String _TYPE = "moveit_msgs/ListRobotStatesInWarehouseRequest";
  static final java.lang.String _DEFINITION = ""
      + "string regex\n"
      + "string robot\n"
      + "";
  java.lang.String getRegex();
  void setRegex(java.lang.String value);
  java.lang.String getRobot();
  void setRobot(java.lang.String value);
}
