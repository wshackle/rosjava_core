package moveit_msgs;

public interface GripperTranslation {
  static final java.lang.String _TYPE = "moveit_msgs/GripperTranslation";
  static final java.lang.String _DEFINITION = ""
      + "# defines a translation for the gripper, used in pickup or place tasks\n"
      + "# for example for lifting an object off a table or approaching the table for placing\n"
      + "# the direction of the translation\n"
      + "geometry_msgs/Vector3Stamped direction\n"
      + "# the desired translation distance\n"
      + "float32 desired_distance\n"
      + "# the min distance that must be considered feasible before the\n"
      + "# grasp is even attempted\n"
      + "float32 min_distance\n"
      + "";
  geometry_msgs.Vector3Stamped getDirection();
  void setDirection(geometry_msgs.Vector3Stamped value);
  float getDesiredDistance();
  void setDesiredDistance(float value);
  float getMinDistance();
  void setMinDistance(float value);
}
