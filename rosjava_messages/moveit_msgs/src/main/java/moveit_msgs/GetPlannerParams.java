package moveit_msgs;

public interface GetPlannerParams {
  static final java.lang.String _TYPE = "moveit_msgs/GetPlannerParams";
  static final java.lang.String _DEFINITION = ""
      + "# Name of planning config\n"
      + "string planner_config\n"
      + "# Optional name of planning group (return global defaults if empty)\n"
      + "string group\n"
      + "---\n"
      + "# parameters as key-value pairs\n"
      + "PlannerParams params\n"
      + "";
}
