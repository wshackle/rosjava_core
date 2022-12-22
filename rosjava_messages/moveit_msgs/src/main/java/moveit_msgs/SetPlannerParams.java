package moveit_msgs;

public interface SetPlannerParams {
  static final java.lang.String _TYPE = "moveit_msgs/SetPlannerParams";
  static final java.lang.String _DEFINITION = ""
      + "# Name of planning config\n"
      + "string planner_config\n"
      + "# Optional name of planning group (set global defaults if empty)\n"
      + "string group\n"
      + "# parameters as key-value pairs\n"
      + "PlannerParams params\n"
      + "# replace params or augment existing ones?\n"
      + "bool replace\n"
      + "---\n"
      + "";
}
