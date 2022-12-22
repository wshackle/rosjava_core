package moveit_msgs;

public interface ChangeDriftDimensions {
  static final java.lang.String _TYPE = "moveit_msgs/ChangeDriftDimensions";
  static final java.lang.String _DEFINITION = ""
      + "# For use with moveit_jog_arm Cartesian planner\n"
      + "#\n"
      + "# Allow the robot to drift along these dimensions in a smooth but unregulated way.\n"
      + "# Give \'true\' to enable drift in the direction, \'false\' to disable.\n"
      + "# For example, may allow wrist rotation by drift_x_rotation == true.\n"
      + "bool drift_x_translation\n"
      + "bool drift_y_translation\n"
      + "bool drift_z_translation\n"
      + "bool drift_x_rotation\n"
      + "bool drift_y_rotation\n"
      + "bool drift_z_rotation\n"
      + "# Not implemented as of Jan 2020 (for now assumed to be the identity matrix). In the future it will allow us to transform\n"
      + "# from the jog control frame to a unique drift frame, so the robot can drift along off-principal axes\n"
      + "geometry_msgs/Transform transform_jog_frame_to_drift_frame\n"
      + "---\n"
      + "bool success\n"
      + "";
}
