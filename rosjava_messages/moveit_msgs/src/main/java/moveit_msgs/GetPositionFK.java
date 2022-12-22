package moveit_msgs;

public interface GetPositionFK {
  static final java.lang.String _TYPE = "moveit_msgs/GetPositionFK";
  static final java.lang.String _DEFINITION = ""
      + "# A service definition for a standard forward kinematics service\n"
      + "# The frame_id in the header message is the frame in which \n"
      + "# the forward kinematics poses will be returned\n"
      + "Header header\n"
      + "# A vector of link name for which forward kinematics must be computed\n"
      + "string[] fk_link_names\n"
      + "# A robot state consisting of joint names and joint positions to be used for forward kinematics\n"
      + "RobotState robot_state\n"
      + "---\n"
      + "# The resultant vector of PoseStamped messages that contains the (stamped) poses of the requested links\n"
      + "geometry_msgs/PoseStamped[] pose_stamped\n"
      + "# The list of link names corresponding to the poses\n"
      + "string[] fk_link_names\n"
      + "MoveItErrorCodes error_code\n"
      + "";
}
