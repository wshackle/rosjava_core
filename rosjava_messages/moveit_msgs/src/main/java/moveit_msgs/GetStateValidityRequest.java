package moveit_msgs;

public interface GetStateValidityRequest {
  static final java.lang.String _TYPE = "moveit_msgs/GetStateValidityRequest";
  static final java.lang.String _DEFINITION = ""
      + "RobotState robot_state\n"
      + "string group_name\n"
      + "Constraints constraints\n"
      + "";
  moveit_msgs.RobotState getRobotState();
  void setRobotState(moveit_msgs.RobotState value);
  java.lang.String getGroupName();
  void setGroupName(java.lang.String value);
  moveit_msgs.Constraints getConstraints();
  void setConstraints(moveit_msgs.Constraints value);
}
