package moveit_msgs;

public interface KinematicSolverInfo {
  static final java.lang.String _TYPE = "moveit_msgs/KinematicSolverInfo";
  static final java.lang.String _DEFINITION = ""
      + "# A list of joints in the kinematic tree\n"
      + "string[] joint_names\n"
      + "# A list of joint limits corresponding to the joint names\n"
      + "moveit_msgs/JointLimits[] limits\n"
      + "# A list of links that the kinematics node provides solutions for\n"
      + "string[] link_names\n"
      + "";
  java.util.List<java.lang.String> getJointNames();
  void setJointNames(java.util.List<java.lang.String> value);
  java.util.List<moveit_msgs.JointLimits> getLimits();
  void setLimits(java.util.List<moveit_msgs.JointLimits> value);
  java.util.List<java.lang.String> getLinkNames();
  void setLinkNames(java.util.List<java.lang.String> value);
}
