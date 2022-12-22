package moveit_msgs;

public interface GetPlanningSceneResponse {
  static final java.lang.String _TYPE = "moveit_msgs/GetPlanningSceneResponse";
  static final java.lang.String _DEFINITION = ""
      + "PlanningScene scene\n"
      + "";
  moveit_msgs.PlanningScene getScene();
  void setScene(moveit_msgs.PlanningScene value);
}
