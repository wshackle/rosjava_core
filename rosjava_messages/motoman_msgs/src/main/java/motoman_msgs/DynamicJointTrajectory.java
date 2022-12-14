package motoman_msgs;

public interface DynamicJointTrajectory extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/DynamicJointTrajectory";
  static final java.lang.String _DEFINITION = "#length: true message/data length\n#header: \n#sequence:\n#num_groups: # of motion groups included in this message\n#group[]: DynamicJointPoint from DynamicJointPoint.msg\n\nHeader header\nstring[] joint_names\nDynamicJointPoint[] points\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<java.lang.String> getJointNames();
  void setJointNames(java.util.List<java.lang.String> value);
  java.util.List<motoman_msgs.DynamicJointPoint> getPoints();
  void setPoints(java.util.List<motoman_msgs.DynamicJointPoint> value);
}
