package moveit_msgs;

public interface OrientationConstraint {
  static final java.lang.String _TYPE = "moveit_msgs/OrientationConstraint";
  static final java.lang.String _DEFINITION = ""
      + "# This message contains the definition of an orientation constraint.\n"
      + "Header header\n"
      + "# The desired orientation of the robot link specified as a quaternion\n"
      + "geometry_msgs/Quaternion orientation\n"
      + "# The robot link this constraint refers to\n"
      + "string link_name\n"
      + "# optional axis-angle error tolerances specified\n"
      + "float64 absolute_x_axis_tolerance\n"
      + "float64 absolute_y_axis_tolerance\n"
      + "float64 absolute_z_axis_tolerance\n"
      + "# A weighting factor for this constraint (denotes relative importance to other constraints. Closer to zero means less important)\n"
      + "float64 weight\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Quaternion getOrientation();
  void setOrientation(geometry_msgs.Quaternion value);
  java.lang.String getLinkName();
  void setLinkName(java.lang.String value);
  double getAbsoluteXAxisTolerance();
  void setAbsoluteXAxisTolerance(double value);
  double getAbsoluteYAxisTolerance();
  void setAbsoluteYAxisTolerance(double value);
  double getAbsoluteZAxisTolerance();
  void setAbsoluteZAxisTolerance(double value);
  double getWeight();
  void setWeight(double value);
}
