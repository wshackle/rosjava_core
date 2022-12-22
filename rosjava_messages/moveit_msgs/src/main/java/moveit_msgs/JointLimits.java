package moveit_msgs;

public interface JointLimits {
  static final java.lang.String _TYPE = "moveit_msgs/JointLimits";
  static final java.lang.String _DEFINITION = ""
      + "# This message contains information about limits of a particular joint (or control dimension)\n"
      + "string joint_name\n"
      + "# true if the joint has position limits\n"
      + "bool has_position_limits\n"
      + "# min and max position limits\n"
      + "float64 min_position\n"
      + "float64 max_position\n"
      + "# true if joint has velocity limits\n"
      + "bool has_velocity_limits\n"
      + "# max velocity limit\n"
      + "float64 max_velocity\n"
      + "# min_velocity is assumed to be -max_velocity\n"
      + "# true if joint has acceleration limits\n"
      + "bool has_acceleration_limits\n"
      + "# max acceleration limit\n"
      + "float64 max_acceleration\n"
      + "# min_acceleration is assumed to be -max_acceleration\n"
      + "";
  java.lang.String getJointName();
  void setJointName(java.lang.String value);
  boolean getHasPositionLimits();
  void setHasPositionLimits(boolean value);
  double getMinPosition();
  void setMinPosition(double value);
  double getMaxPosition();
  void setMaxPosition(double value);
  boolean getHasVelocityLimits();
  void setHasVelocityLimits(boolean value);
  double getMaxVelocity();
  void setMaxVelocity(double value);
  boolean getHasAccelerationLimits();
  void setHasAccelerationLimits(boolean value);
  double getMaxAcceleration();
  void setMaxAcceleration(double value);
}
