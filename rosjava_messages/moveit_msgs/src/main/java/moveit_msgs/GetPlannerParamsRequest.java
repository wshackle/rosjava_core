package moveit_msgs;

public interface GetPlannerParamsRequest {
  static final java.lang.String _TYPE = "moveit_msgs/GetPlannerParamsRequest";
  static final java.lang.String _DEFINITION = ""
      + "# Name of planning config\n"
      + "string planner_config\n"
      + "# Optional name of planning group (return global defaults if empty)\n"
      + "string group\n"
      + "";
  java.lang.String getPlannerConfig();
  void setPlannerConfig(java.lang.String value);
  java.lang.String getGroup();
  void setGroup(java.lang.String value);
}
