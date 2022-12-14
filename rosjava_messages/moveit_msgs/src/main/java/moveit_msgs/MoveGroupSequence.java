package moveit_msgs;

public interface MoveGroupSequence extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/MoveGroupSequence";
  static final java.lang.String _DEFINITION = "# A list of motion commands - one for each section of the sequence\nMotionSequenceRequest request\n\n# Planning options\nPlanningOptions planning_options\n---\n\n# Response comprising information on all sections of the sequence\nMotionSequenceResponse response\n\n---\n\n# The internal state that the move group action currently is in\nstring state\n";
}
