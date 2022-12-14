package moveit_msgs;

public interface ChangeDriftDimensionsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/ChangeDriftDimensionsRequest";
  static final java.lang.String _DEFINITION = "# For use with moveit_jog_arm Cartesian planner\n#\n# Allow the robot to drift along these dimensions in a smooth but unregulated way.\n# Give \'true\' to enable drift in the direction, \'false\' to disable.\n# For example, may allow wrist rotation by drift_x_rotation == true.\nbool drift_x_translation\nbool drift_y_translation\nbool drift_z_translation\nbool drift_x_rotation\nbool drift_y_rotation\nbool drift_z_rotation\n\n# Not implemented as of Jan 2020 (for now assumed to be the identity matrix). In the future it will allow us to transform\n# from the jog control frame to a unique drift frame, so the robot can drift along off-principal axes\ngeometry_msgs/Transform transform_jog_frame_to_drift_frame\n";
  boolean getDriftXTranslation();
  void setDriftXTranslation(boolean value);
  boolean getDriftYTranslation();
  void setDriftYTranslation(boolean value);
  boolean getDriftZTranslation();
  void setDriftZTranslation(boolean value);
  boolean getDriftXRotation();
  void setDriftXRotation(boolean value);
  boolean getDriftYRotation();
  void setDriftYRotation(boolean value);
  boolean getDriftZRotation();
  void setDriftZRotation(boolean value);
  geometry_msgs.Transform getTransformJogFrameToDriftFrame();
  void setTransformJogFrameToDriftFrame(geometry_msgs.Transform value);
}
