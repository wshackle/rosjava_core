package nav_msgs;

public interface Path {
  static final java.lang.String _TYPE = "nav_msgs/Path";
  static final java.lang.String _DEFINITION = ""
      + "#An array of poses that represents a Path for a robot to follow\n"
      + "Header header\n"
      + "geometry_msgs/PoseStamped[] poses\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<geometry_msgs.PoseStamped> getPoses();
  void setPoses(java.util.List<geometry_msgs.PoseStamped> value);
}
