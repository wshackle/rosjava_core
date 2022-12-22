package moveit_msgs;

public interface PlanningSceneWorld {
  static final java.lang.String _TYPE = "moveit_msgs/PlanningSceneWorld";
  static final java.lang.String _DEFINITION = ""
      + "# collision objects\n"
      + "CollisionObject[] collision_objects\n"
      + "# The octomap that represents additional collision data\n"
      + "octomap_msgs/OctomapWithPose octomap\n"
      + "";
  java.util.List<moveit_msgs.CollisionObject> getCollisionObjects();
  void setCollisionObjects(java.util.List<moveit_msgs.CollisionObject> value);
  octomap_msgs.OctomapWithPose getOctomap();
  void setOctomap(octomap_msgs.OctomapWithPose value);
}
