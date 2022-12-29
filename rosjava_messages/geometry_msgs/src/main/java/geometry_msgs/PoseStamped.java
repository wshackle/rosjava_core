package geometry_msgs;

public interface PoseStamped {
  static final java.lang.String _TYPE = "geometry_msgs/PoseStamped";
  static final java.lang.String _DEFINITION = ""
      + "# A Pose with reference coordinate frame and timestamp\n"
      + "Header header\n"
      + "Pose pose\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Pose getPose();
  void setPose(geometry_msgs.Pose value);
}
