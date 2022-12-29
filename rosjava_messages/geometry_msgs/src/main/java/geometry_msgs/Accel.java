package geometry_msgs;

public interface Accel {
  static final java.lang.String _TYPE = "geometry_msgs/Accel";
  static final java.lang.String _DEFINITION = ""
      + "# This expresses acceleration in free space broken into its linear and angular parts.\n"
      + "Vector3  linear\n"
      + "Vector3  angular\n"
      + "";
  geometry_msgs.Vector3 getLinear();
  void setLinear(geometry_msgs.Vector3 value);
  geometry_msgs.Vector3 getAngular();
  void setAngular(geometry_msgs.Vector3 value);
}
