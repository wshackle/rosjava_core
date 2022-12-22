package moveit_msgs;

public interface PlanningScene {
  static final java.lang.String _TYPE = "moveit_msgs/PlanningScene";
  static final java.lang.String _DEFINITION = ""
      + "# name of planning scene\n"
      + "string name\n"
      + "# full robot state\n"
      + "RobotState robot_state\n"
      + "# The name of the robot model this scene is for\n"
      + "string robot_model_name\n"
      + "#additional frames for duplicating tf (with respect to the planning frame)\n"
      + "geometry_msgs/TransformStamped[] fixed_frame_transforms\n"
      + "#full allowed collision matrix\n"
      + "AllowedCollisionMatrix allowed_collision_matrix\n"
      + "# all link paddings\n"
      + "LinkPadding[] link_padding\n"
      + "# all link scales\n"
      + "LinkScale[] link_scale\n"
      + "# Attached objects, collision objects, even the octomap or collision map can have \n"
      + "# colors associated to them. This array specifies them.\n"
      + "ObjectColor[] object_colors\n"
      + "# the collision map\n"
      + "PlanningSceneWorld world\n"
      + "# Flag indicating whether this scene is to be interpreted as a diff with respect to some other scene\n"
      + "bool is_diff\n"
      + "";
  java.lang.String getName();
  void setName(java.lang.String value);
  moveit_msgs.RobotState getRobotState();
  void setRobotState(moveit_msgs.RobotState value);
  java.lang.String getRobotModelName();
  void setRobotModelName(java.lang.String value);
  java.util.List<geometry_msgs.TransformStamped> getFixedFrameTransforms();
  void setFixedFrameTransforms(java.util.List<geometry_msgs.TransformStamped> value);
  moveit_msgs.AllowedCollisionMatrix getAllowedCollisionMatrix();
  void setAllowedCollisionMatrix(moveit_msgs.AllowedCollisionMatrix value);
  java.util.List<moveit_msgs.LinkPadding> getLinkPadding();
  void setLinkPadding(java.util.List<moveit_msgs.LinkPadding> value);
  java.util.List<moveit_msgs.LinkScale> getLinkScale();
  void setLinkScale(java.util.List<moveit_msgs.LinkScale> value);
  java.util.List<moveit_msgs.ObjectColor> getObjectColors();
  void setObjectColors(java.util.List<moveit_msgs.ObjectColor> value);
  moveit_msgs.PlanningSceneWorld getWorld();
  void setWorld(moveit_msgs.PlanningSceneWorld value);
  boolean getIsDiff();
  void setIsDiff(boolean value);
}
