package moveit_msgs;

public interface MotionSequenceRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/MotionSequenceRequest";
  static final java.lang.String _DEFINITION = "# List of motion planning request with a blend_radius for each.\n# In the response of the planner all of these will be executable as one sequence.\nMotionSequenceItem[] items\n";
  java.util.List<moveit_msgs.MotionSequenceItem> getItems();
  void setItems(java.util.List<moveit_msgs.MotionSequenceItem> value);
}
