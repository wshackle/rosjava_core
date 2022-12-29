package geometry_msgs;

public interface PointStamped {
  static final java.lang.String _TYPE = "geometry_msgs/PointStamped";
  static final java.lang.String _DEFINITION = ""
      + "# This represents a Point with reference coordinate frame and timestamp\n"
      + "Header header\n"
      + "Point point\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Point getPoint();
  void setPoint(geometry_msgs.Point value);
}
