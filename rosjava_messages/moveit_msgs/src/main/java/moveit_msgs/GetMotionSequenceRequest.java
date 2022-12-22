package moveit_msgs;

public interface GetMotionSequenceRequest {
  static final java.lang.String _TYPE = "moveit_msgs/GetMotionSequenceRequest";
  static final java.lang.String _DEFINITION = ""
      + "# Planning request with a list of motion commands\n"
      + "MotionSequenceRequest request\n"
      + "";
  moveit_msgs.MotionSequenceRequest getRequest();
  void setRequest(moveit_msgs.MotionSequenceRequest value);
}
