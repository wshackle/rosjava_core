package moveit_msgs;

public interface GetMotionSequenceResponse {
  static final java.lang.String _TYPE = "moveit_msgs/GetMotionSequenceResponse";
  static final java.lang.String _DEFINITION = ""
      + "# Response to the planning request\n"
      + "MotionSequenceResponse response\n"
      + "";
  moveit_msgs.MotionSequenceResponse getResponse();
  void setResponse(moveit_msgs.MotionSequenceResponse value);
}
