package moveit_msgs;

public interface MoveGroupSequence {
  static final java.lang.String _TYPE = "moveit_msgs/MoveGroupSequence";
  static final java.lang.String _DEFINITION = ""
      + "# A list of motion commands - one for each section of the sequence\n"
      + "MotionSequenceRequest request\n"
      + "# Planning options\n"
      + "PlanningOptions planning_options\n"
      + "---\n"
      + "# Response comprising information on all sections of the sequence\n"
      + "MotionSequenceResponse response\n"
      + "---\n"
      + "# The internal state that the move group action currently is in\n"
      + "string state\n"
      + "";
}
