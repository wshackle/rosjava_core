package geometry_msgs;

public interface PoseWithCovarianceStamped {
  static final java.lang.String _TYPE = "geometry_msgs/PoseWithCovarianceStamped";
  static final java.lang.String _DEFINITION = ""
      + "# This expresses an estimated pose with a reference coordinate frame and timestamp\n"
      + "Header header\n"
      + "PoseWithCovariance pose\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.PoseWithCovariance getPose();
  void setPose(geometry_msgs.PoseWithCovariance value);
}
