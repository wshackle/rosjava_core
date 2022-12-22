package moveit_msgs;

public interface PlannerInterfaceDescription {
  static final java.lang.String _TYPE = "moveit_msgs/PlannerInterfaceDescription";
  static final java.lang.String _DEFINITION = ""
      + "# The name of the planner interface\n"
      + "string name\n"
      + "# The names of the planner ids within the interface\n"
      + "string[] planner_ids\n"
      + "";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.util.List<java.lang.String> getPlannerIds();
  void setPlannerIds(java.util.List<java.lang.String> value);
}
