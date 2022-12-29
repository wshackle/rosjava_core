package geometry_msgs;

public interface InertiaStamped {
  static final java.lang.String _TYPE = "geometry_msgs/InertiaStamped";
  static final java.lang.String _DEFINITION = ""
      + "Header header\n"
      + "Inertia inertia\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Inertia getInertia();
  void setInertia(geometry_msgs.Inertia value);
}
