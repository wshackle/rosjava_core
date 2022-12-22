package moveit_msgs;

public interface QueryPlannerInterfacesResponse {
  static final java.lang.String _TYPE = "moveit_msgs/QueryPlannerInterfacesResponse";
  static final java.lang.String _DEFINITION = ""
      + "# The planning instances that could be used in the benchmark\n"
      + "PlannerInterfaceDescription[] planner_interfaces\n"
      + "";
  java.util.List<moveit_msgs.PlannerInterfaceDescription> getPlannerInterfaces();
  void setPlannerInterfaces(java.util.List<moveit_msgs.PlannerInterfaceDescription> value);
}
