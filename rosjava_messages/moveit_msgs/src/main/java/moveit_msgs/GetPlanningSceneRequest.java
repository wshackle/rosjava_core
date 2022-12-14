package moveit_msgs;

public interface GetPlanningSceneRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetPlanningSceneRequest";
  static final java.lang.String _DEFINITION = "# Get parts of the planning scene that are of interest\n# All scene components are returned if none are specified\nPlanningSceneComponents components\n";
  moveit_msgs.PlanningSceneComponents getComponents();
  void setComponents(moveit_msgs.PlanningSceneComponents value);
}
