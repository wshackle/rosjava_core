package moveit_msgs;

public interface MoveGroupSequenceGoal {
  static final java.lang.String _TYPE = "moveit_msgs/MoveGroupSequenceGoal";
  static final java.lang.String _DEFINITION = ""
      + "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n"
      + "#goal definition# A list of motion commands - one for each section of the sequence\n"
      + "MotionSequenceRequest request\n"
      + "# Planning options\n"
      + "PlanningOptions planning_options\n"
      + "";
  moveit_msgs.MotionSequenceRequest getRequest();
  void setRequest(moveit_msgs.MotionSequenceRequest value);
  moveit_msgs.PlanningOptions getPlanningOptions();
  void setPlanningOptions(moveit_msgs.PlanningOptions value);
}
