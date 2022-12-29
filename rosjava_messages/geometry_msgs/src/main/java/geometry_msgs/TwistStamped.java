package geometry_msgs;

public interface TwistStamped {
  static final java.lang.String _TYPE = "geometry_msgs/TwistStamped";
  static final java.lang.String _DEFINITION = ""
      + "# A twist with reference coordinate frame and timestamp\n"
      + "Header header\n"
      + "Twist twist\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Twist getTwist();
  void setTwist(geometry_msgs.Twist value);
}
