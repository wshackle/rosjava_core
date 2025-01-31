package nav_msgs;

public interface Odometry {
  static final java.lang.String _TYPE = "nav_msgs/Odometry";
  static final java.lang.String _DEFINITION = ""
      + "# This represents an estimate of a position and velocity in free space.  \n"
      + "# The pose in this message should be specified in the coordinate frame given by header.frame_id.\n"
      + "# The twist in this message should be specified in the coordinate frame given by the child_frame_id\n"
      + "Header header\n"
      + "string child_frame_id\n"
      + "geometry_msgs/PoseWithCovariance pose\n"
      + "geometry_msgs/TwistWithCovariance twist\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getChildFrameId();
  void setChildFrameId(java.lang.String value);
  geometry_msgs.PoseWithCovariance getPose();
  void setPose(geometry_msgs.PoseWithCovariance value);
  geometry_msgs.TwistWithCovariance getTwist();
  void setTwist(geometry_msgs.TwistWithCovariance value);
}
