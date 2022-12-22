package moveit_msgs;

public interface GraspPlanningRequest {
  static final java.lang.String _TYPE = "moveit_msgs/GraspPlanningRequest";
  static final java.lang.String _DEFINITION = ""
      + "# Requests that grasp planning be performed for the target object\n"
      + "# returns a list of candidate grasps to be tested and executed\n"
      + "# the planning group used\n"
      + "string group_name\n"
      + "# the object to be grasped\n"
      + "CollisionObject target\n"
      + "# the names of the relevant support surfaces (e.g. tables) in the collision map\n"
      + "# can be left empty if no names are available\n"
      + "string[] support_surfaces\n"
      + "# an optional list of grasps to be evaluated by the planner\n"
      + "Grasp[] candidate_grasps\n"
      + "# an optional list of obstacles that we have semantic information about\n"
      + "# and that can be moved in the course of grasping\n"
      + "CollisionObject[] movable_obstacles\n"
      + "";
  java.lang.String getGroupName();
  void setGroupName(java.lang.String value);
  moveit_msgs.CollisionObject getTarget();
  void setTarget(moveit_msgs.CollisionObject value);
  java.util.List<java.lang.String> getSupportSurfaces();
  void setSupportSurfaces(java.util.List<java.lang.String> value);
  java.util.List<moveit_msgs.Grasp> getCandidateGrasps();
  void setCandidateGrasps(java.util.List<moveit_msgs.Grasp> value);
  java.util.List<moveit_msgs.CollisionObject> getMovableObstacles();
  void setMovableObstacles(java.util.List<moveit_msgs.CollisionObject> value);
}
