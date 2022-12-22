package moveit_msgs;

public interface GetPositionIK {
  static final java.lang.String _TYPE = "moveit_msgs/GetPositionIK";
  static final java.lang.String _DEFINITION = ""
      + "# A service call to carry out an inverse kinematics computation\n"
      + "# The inverse kinematics request\n"
      + "PositionIKRequest ik_request\n"
      + "---\n"
      + "# The returned solution \n"
      + "# (in the same order as the list of joints specified in the IKRequest message)\n"
      + "RobotState solution\n"
      + "MoveItErrorCodes error_code\n"
      + "";
}
