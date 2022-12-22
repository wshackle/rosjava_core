package moveit_msgs;

public interface ChangeControlDimensionsRequest {
  static final java.lang.String _TYPE = "moveit_msgs/ChangeControlDimensionsRequest";
  static final java.lang.String _DEFINITION = ""
      + "# For use with moveit_jog_arm Cartesian planner\n"
      + "#\n"
      + "# Turn on/off jogging along these dimensions.\n"
      + "# Give \'true\' to enable jogging in the direction, \'false\' to disable\n"
      + "bool control_x_translation\n"
      + "bool control_y_translation\n"
      + "bool control_z_translation\n"
      + "bool control_x_rotation\n"
      + "bool control_y_rotation\n"
      + "bool control_z_rotation\n"
      + "";
  boolean getControlXTranslation();
  void setControlXTranslation(boolean value);
  boolean getControlYTranslation();
  void setControlYTranslation(boolean value);
  boolean getControlZTranslation();
  void setControlZTranslation(boolean value);
  boolean getControlXRotation();
  void setControlXRotation(boolean value);
  boolean getControlYRotation();
  void setControlYRotation(boolean value);
  boolean getControlZRotation();
  void setControlZRotation(boolean value);
}
