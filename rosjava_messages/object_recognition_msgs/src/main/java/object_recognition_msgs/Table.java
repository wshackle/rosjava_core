package object_recognition_msgs;

public interface Table {
  static final java.lang.String _TYPE = "object_recognition_msgs/Table";
  static final java.lang.String _DEFINITION = ""
      + "# Informs that a planar table has been detected at a given location\n"
      + "Header header\n"
      + "# The pose gives you the transform that take you to the coordinate system\n"
      + "# of the table, with the origin somewhere in the table plane and the \n"
      + "# z axis normal to the plane\n"
      + "geometry_msgs/Pose pose\n"
      + "# There is no guarantee that the table does NOT extend further than the\n"
      + "# convex hull; this is just as far as we\'ve observed it.\n"
      + "# The origin of the table coordinate system is inside the convex hull\n"
      + "# Set of points forming the convex hull of the table\n"
      + "geometry_msgs/Point[] convex_hull\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Pose getPose();
  void setPose(geometry_msgs.Pose value);
  java.util.List<geometry_msgs.Point> getConvexHull();
  void setConvexHull(java.util.List<geometry_msgs.Point> value);
}
