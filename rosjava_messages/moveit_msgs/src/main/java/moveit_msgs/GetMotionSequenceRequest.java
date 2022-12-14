package moveit_msgs;

public interface GetMotionSequenceRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetMotionSequenceRequest";
  static final java.lang.String _DEFINITION = "# Planning request with a list of motion commands\nMotionSequenceRequest request\n\n";
  moveit_msgs.MotionSequenceRequest getRequest();
  void setRequest(moveit_msgs.MotionSequenceRequest value);
}
