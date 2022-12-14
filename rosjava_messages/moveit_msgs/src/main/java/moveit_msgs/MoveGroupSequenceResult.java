package moveit_msgs;

public interface MoveGroupSequenceResult extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/MoveGroupSequenceResult";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n#result definition\n# Response comprising information on all sections of the sequence\nMotionSequenceResponse response\n\n";
  moveit_msgs.MotionSequenceResponse getResponse();
  void setResponse(moveit_msgs.MotionSequenceResponse value);
}
