package geometry_msgs;

public interface QuaternionStamped {
  static final java.lang.String _TYPE = "geometry_msgs/QuaternionStamped";
  static final java.lang.String _DEFINITION = ""
      + "# This represents an orientation with reference coordinate frame and timestamp.\n"
      + "Header header\n"
      + "Quaternion quaternion\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Quaternion getQuaternion();
  void setQuaternion(geometry_msgs.Quaternion value);
}
