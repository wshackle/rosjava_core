package moveit_msgs;

public interface ChangeControlDimensionsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/ChangeControlDimensionsRequest";
  static final java.lang.String _DEFINITION = "# For use with moveit_jog_arm Cartesian planner\n#\n# Turn on/off jogging along these dimensions.\n# Give \'true\' to enable jogging in the direction, \'false\' to disable\nbool control_x_translation\nbool control_y_translation\nbool control_z_translation\nbool control_x_rotation\nbool control_y_rotation\nbool control_z_rotation\n";
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
