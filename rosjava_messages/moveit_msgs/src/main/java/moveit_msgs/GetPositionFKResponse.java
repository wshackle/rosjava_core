package moveit_msgs;

public interface GetPositionFKResponse {
  static final java.lang.String _TYPE = "moveit_msgs/GetPositionFKResponse";
  static final java.lang.String _DEFINITION = ""
      + "# The resultant vector of PoseStamped messages that contains the (stamped) poses of the requested links\n"
      + "geometry_msgs/PoseStamped[] pose_stamped\n"
      + "# The list of link names corresponding to the poses\n"
      + "string[] fk_link_names\n"
      + "MoveItErrorCodes error_code\n"
      + "";
  java.util.List<geometry_msgs.PoseStamped> getPoseStamped();
  void setPoseStamped(java.util.List<geometry_msgs.PoseStamped> value);
  java.util.List<java.lang.String> getFkLinkNames();
  void setFkLinkNames(java.util.List<java.lang.String> value);
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
