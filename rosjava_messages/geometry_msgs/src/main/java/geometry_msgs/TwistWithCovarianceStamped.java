package geometry_msgs;

public interface TwistWithCovarianceStamped {
  static final java.lang.String _TYPE = "geometry_msgs/TwistWithCovarianceStamped";
  static final java.lang.String _DEFINITION = ""
      + "# This represents an estimated twist with reference coordinate frame and timestamp.\n"
      + "Header header\n"
      + "TwistWithCovariance twist\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.TwistWithCovariance getTwist();
  void setTwist(geometry_msgs.TwistWithCovariance value);
}
