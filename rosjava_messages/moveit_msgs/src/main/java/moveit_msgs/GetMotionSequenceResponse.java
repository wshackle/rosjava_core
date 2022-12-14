package moveit_msgs;

public interface GetMotionSequenceResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetMotionSequenceResponse";
  static final java.lang.String _DEFINITION = "# Response to the planning request\nMotionSequenceResponse response";
  moveit_msgs.MotionSequenceResponse getResponse();
  void setResponse(moveit_msgs.MotionSequenceResponse value);
}
