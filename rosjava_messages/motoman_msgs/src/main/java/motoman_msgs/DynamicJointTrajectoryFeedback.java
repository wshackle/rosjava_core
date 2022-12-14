package motoman_msgs;

public interface DynamicJointTrajectoryFeedback extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/DynamicJointTrajectoryFeedback";
  static final java.lang.String _DEFINITION = "Header header\nint16 num_groups\nDynamicJointState[] joint_feedbacks\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  short getNumGroups();
  void setNumGroups(short value);
  java.util.List<motoman_msgs.DynamicJointState> getJointFeedbacks();
  void setJointFeedbacks(java.util.List<motoman_msgs.DynamicJointState> value);
}
