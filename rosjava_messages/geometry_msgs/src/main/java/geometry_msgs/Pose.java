package geometry_msgs;

public interface Pose {
  static final java.lang.String _TYPE = "geometry_msgs/Pose";
  static final java.lang.String _DEFINITION = ""
      + "# A representation of pose in free space, composed of position and orientation. \n"
      + "Point position\n"
      + "Quaternion orientation\n"
      + "";
  geometry_msgs.Point getPosition();
  void setPosition(geometry_msgs.Point value);
  geometry_msgs.Quaternion getOrientation();
  void setOrientation(geometry_msgs.Quaternion value);
}
