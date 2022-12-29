package nav_msgs;

public interface GetPlan {
  static final java.lang.String _TYPE = "nav_msgs/GetPlan";
  static final java.lang.String _DEFINITION = ""
      + "# Get a plan from the current position to the goal Pose \n"
      + "# The start pose for the plan\n"
      + "geometry_msgs/PoseStamped start\n"
      + "# The final pose of the goal position\n"
      + "geometry_msgs/PoseStamped goal\n"
      + "# If the goal is obstructed, how many meters the planner can \n"
      + "# relax the constraint in x and y before failing. \n"
      + "float32 tolerance\n"
      + "---\n"
      + "nav_msgs/Path plan\n"
      + "";
}
