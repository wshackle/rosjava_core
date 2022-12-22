package moveit_msgs;

public interface RenameRobotStateInWarehouseRequest {
  static final java.lang.String _TYPE = "moveit_msgs/RenameRobotStateInWarehouseRequest";
  static final java.lang.String _DEFINITION = ""
      + "string old_name\n"
      + "string new_name\n"
      + "string robot\n"
      + "";
  java.lang.String getOldName();
  void setOldName(java.lang.String value);
  java.lang.String getNewName();
  void setNewName(java.lang.String value);
  java.lang.String getRobot();
  void setRobot(java.lang.String value);
}
