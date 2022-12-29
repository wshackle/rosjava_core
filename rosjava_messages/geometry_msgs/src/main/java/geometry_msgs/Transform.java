package geometry_msgs;

public interface Transform {
  static final java.lang.String _TYPE = "geometry_msgs/Transform";
  static final java.lang.String _DEFINITION = ""
      + "# This represents the transform between two coordinate frames in free space.\n"
      + "Vector3 translation\n"
      + "Quaternion rotation\n"
      + "";
  geometry_msgs.Vector3 getTranslation();
  void setTranslation(geometry_msgs.Vector3 value);
  geometry_msgs.Quaternion getRotation();
  void setRotation(geometry_msgs.Quaternion value);
}
