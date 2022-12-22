package moveit_msgs;

public interface GraspPlanningResponse {
  static final java.lang.String _TYPE = "moveit_msgs/GraspPlanningResponse";
  static final java.lang.String _DEFINITION = ""
      + "# the list of planned grasps\n"
      + "Grasp[] grasps\n"
      + "# whether an error occurred\n"
      + "MoveItErrorCodes error_code\n"
      + "";
  java.util.List<moveit_msgs.Grasp> getGrasps();
  void setGrasps(java.util.List<moveit_msgs.Grasp> value);
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
