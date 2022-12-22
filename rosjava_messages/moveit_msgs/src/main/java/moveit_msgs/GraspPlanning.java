package moveit_msgs;

public interface GraspPlanning {
  static final java.lang.String _TYPE = "moveit_msgs/GraspPlanning";
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
      + "---\n"
      + "# the list of planned grasps\n"
      + "Grasp[] grasps\n"
      + "# whether an error occurred\n"
      + "MoveItErrorCodes error_code\n"
      + "";
}
