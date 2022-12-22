package moveit_msgs;

public interface GetPlannerParamsResponse {
  static final java.lang.String _TYPE = "moveit_msgs/GetPlannerParamsResponse";
  static final java.lang.String _DEFINITION = ""
      + "# parameters as key-value pairs\n"
      + "PlannerParams params\n"
      + "";
  moveit_msgs.PlannerParams getParams();
  void setParams(moveit_msgs.PlannerParams value);
}
