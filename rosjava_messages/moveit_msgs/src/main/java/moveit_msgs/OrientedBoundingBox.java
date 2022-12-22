package moveit_msgs;

public interface OrientedBoundingBox {
  static final java.lang.String _TYPE = "moveit_msgs/OrientedBoundingBox";
  static final java.lang.String _DEFINITION = ""
      + "# the pose of the box\n"
      + "geometry_msgs/Pose pose\n"
      + "# the extents of the box, assuming the center is at the origin\n"
      + "geometry_msgs/Point32 extents\n"
      + "";
  geometry_msgs.Pose getPose();
  void setPose(geometry_msgs.Pose value);
  geometry_msgs.Point32 getExtents();
  void setExtents(geometry_msgs.Point32 value);
}
