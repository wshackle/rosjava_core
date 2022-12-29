package geometry_msgs;

public interface WrenchStamped {
  static final java.lang.String _TYPE = "geometry_msgs/WrenchStamped";
  static final java.lang.String _DEFINITION = ""
      + "# A wrench with reference coordinate frame and timestamp\n"
      + "Header header\n"
      + "Wrench wrench\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Wrench getWrench();
  void setWrench(geometry_msgs.Wrench value);
}
