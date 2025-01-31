package moveit_msgs;

public interface PlaceLocation {
  static final java.lang.String _TYPE = "moveit_msgs/PlaceLocation";
  static final java.lang.String _DEFINITION = ""
      + "# A name for this grasp\n"
      + "string id\n"
      + "# The internal posture of the hand for the grasp\n"
      + "# positions and efforts are used\n"
      + "trajectory_msgs/JointTrajectory post_place_posture\n"
      + "# The position of the end-effector for the grasp relative to a reference frame \n"
      + "# (that is always specified elsewhere, not in this message)\n"
      + "geometry_msgs/PoseStamped place_pose\n"
      + "# The approach motion\n"
      + "GripperTranslation pre_place_approach\n"
      + "# The retreat motion\n"
      + "GripperTranslation post_place_retreat\n"
      + "# an optional list of obstacles that we have semantic information about\n"
      + "# and that can be touched/pushed/moved in the course of grasping\n"
      + "string[] allowed_touch_objects\n"
      + "";
  java.lang.String getId();
  void setId(java.lang.String value);
  trajectory_msgs.JointTrajectory getPostPlacePosture();
  void setPostPlacePosture(trajectory_msgs.JointTrajectory value);
  geometry_msgs.PoseStamped getPlacePose();
  void setPlacePose(geometry_msgs.PoseStamped value);
  moveit_msgs.GripperTranslation getPrePlaceApproach();
  void setPrePlaceApproach(moveit_msgs.GripperTranslation value);
  moveit_msgs.GripperTranslation getPostPlaceRetreat();
  void setPostPlaceRetreat(moveit_msgs.GripperTranslation value);
  java.util.List<java.lang.String> getAllowedTouchObjects();
  void setAllowedTouchObjects(java.util.List<java.lang.String> value);
}
