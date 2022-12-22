package moveit_msgs;

public interface SetPlannerParamsRequest {
  static final java.lang.String _TYPE = "moveit_msgs/SetPlannerParamsRequest";
  static final java.lang.String _DEFINITION = ""
      + "# Name of planning config\n"
      + "string planner_config\n"
      + "# Optional name of planning group (set global defaults if empty)\n"
      + "string group\n"
      + "# parameters as key-value pairs\n"
      + "PlannerParams params\n"
      + "# replace params or augment existing ones?\n"
      + "bool replace\n"
      + "";
  java.lang.String getPlannerConfig();
  void setPlannerConfig(java.lang.String value);
  java.lang.String getGroup();
  void setGroup(java.lang.String value);
  moveit_msgs.PlannerParams getParams();
  void setParams(moveit_msgs.PlannerParams value);
  boolean getReplace();
  void setReplace(boolean value);
}
