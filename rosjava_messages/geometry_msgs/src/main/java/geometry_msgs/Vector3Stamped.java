package geometry_msgs;

public interface Vector3Stamped {
  static final java.lang.String _TYPE = "geometry_msgs/Vector3Stamped";
  static final java.lang.String _DEFINITION = ""
      + "# This represents a Vector3 with reference coordinate frame and timestamp\n"
      + "Header header\n"
      + "Vector3 vector\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Vector3 getVector();
  void setVector(geometry_msgs.Vector3 value);
}
