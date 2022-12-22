package moveit_msgs;

public interface GetPositionIKRequest {
  static final java.lang.String _TYPE = "moveit_msgs/GetPositionIKRequest";
  static final java.lang.String _DEFINITION = ""
      + "# A service call to carry out an inverse kinematics computation\n"
      + "# The inverse kinematics request\n"
      + "PositionIKRequest ik_request\n"
      + "";
  moveit_msgs.PositionIKRequest getIkRequest();
  void setIkRequest(moveit_msgs.PositionIKRequest value);
}
