package moveit_msgs;

public interface GetMotionPlanRequest {
  static final java.lang.String _TYPE = "moveit_msgs/GetMotionPlanRequest";
  static final java.lang.String _DEFINITION = ""
      + "# This service contains the definition for a request to the motion\n"
      + "# planner and the output it provides\n"
      + "MotionPlanRequest motion_plan_request\n"
      + "";
  moveit_msgs.MotionPlanRequest getMotionPlanRequest();
  void setMotionPlanRequest(moveit_msgs.MotionPlanRequest value);
}
