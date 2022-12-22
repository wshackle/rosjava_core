package moveit_msgs;

public interface GetPositionIKResponse {
  static final java.lang.String _TYPE = "moveit_msgs/GetPositionIKResponse";
  static final java.lang.String _DEFINITION = ""
      + "# The returned solution \n"
      + "# (in the same order as the list of joints specified in the IKRequest message)\n"
      + "RobotState solution\n"
      + "MoveItErrorCodes error_code\n"
      + "";
  moveit_msgs.RobotState getSolution();
  void setSolution(moveit_msgs.RobotState value);
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
