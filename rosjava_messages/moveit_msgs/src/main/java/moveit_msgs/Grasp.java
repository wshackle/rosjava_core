package moveit_msgs;

public interface Grasp {
  static final java.lang.String _TYPE = "moveit_msgs/Grasp";
  static final java.lang.String _DEFINITION = ""
      + "# This message contains a description of a grasp that would be used\n"
      + "# with a particular end-effector to grasp an object, including how to\n"
      + "# approach it, grip it, etc.  This message does not contain any\n"
      + "# information about a \"grasp point\" (a position ON the object).\n"
      + "# Whatever generates this message should have already combined\n"
      + "# information about grasp points with information about the geometry\n"
      + "# of the end-effector to compute the grasp_pose in this message.\n"
      + "# A name for this grasp\n"
      + "string id\n"
      + "# The internal posture of the hand for the pre-grasp\n"
      + "# only positions are used\n"
      + "trajectory_msgs/JointTrajectory pre_grasp_posture\n"
      + "# The internal posture of the hand for the grasp\n"
      + "# positions and efforts are used\n"
      + "trajectory_msgs/JointTrajectory grasp_posture\n"
      + "# The position of the end-effector for the grasp.  This is the pose of\n"
      + "# the \"parent_link\" of the end-effector, not actually the pose of any\n"
      + "# link *in* the end-effector.  Typically this would be the pose of the\n"
      + "# most distal wrist link before the hand (end-effector) links began.\n"
      + "geometry_msgs/PoseStamped grasp_pose\n"
      + "# The estimated probability of success for this grasp, or some other\n"
      + "# measure of how \"good\" it is.\n"
      + "float64 grasp_quality\n"
      + "# The approach direction to take before picking an object\n"
      + "GripperTranslation pre_grasp_approach\n"
      + "# The retreat direction to take after a grasp has been completed (object is attached)\n"
      + "GripperTranslation post_grasp_retreat\n"
      + "# The retreat motion to perform when releasing the object; this information\n"
      + "# is not necessary for the grasp itself, but when releasing the object,\n"
      + "# the information will be necessary. The grasp used to perform a pickup\n"
      + "# is returned as part of the result, so this information is available for \n"
      + "# later use.\n"
      + "GripperTranslation post_place_retreat\n"
      + "# the maximum contact force to use while grasping (<=0 to disable)\n"
      + "float32 max_contact_force\n"
      + "# an optional list of obstacles that we have semantic information about\n"
      + "# and that can be touched/pushed/moved in the course of grasping\n"
      + "string[] allowed_touch_objects\n"
      + "";
  java.lang.String getId();
  void setId(java.lang.String value);
  trajectory_msgs.JointTrajectory getPreGraspPosture();
  void setPreGraspPosture(trajectory_msgs.JointTrajectory value);
  trajectory_msgs.JointTrajectory getGraspPosture();
  void setGraspPosture(trajectory_msgs.JointTrajectory value);
  geometry_msgs.PoseStamped getGraspPose();
  void setGraspPose(geometry_msgs.PoseStamped value);
  double getGraspQuality();
  void setGraspQuality(double value);
  moveit_msgs.GripperTranslation getPreGraspApproach();
  void setPreGraspApproach(moveit_msgs.GripperTranslation value);
  moveit_msgs.GripperTranslation getPostGraspRetreat();
  void setPostGraspRetreat(moveit_msgs.GripperTranslation value);
  moveit_msgs.GripperTranslation getPostPlaceRetreat();
  void setPostPlaceRetreat(moveit_msgs.GripperTranslation value);
  float getMaxContactForce();
  void setMaxContactForce(float value);
  java.util.List<java.lang.String> getAllowedTouchObjects();
  void setAllowedTouchObjects(java.util.List<java.lang.String> value);
}
