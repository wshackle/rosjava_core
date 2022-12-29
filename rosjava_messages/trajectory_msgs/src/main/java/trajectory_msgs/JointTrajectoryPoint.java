package trajectory_msgs;

public interface JointTrajectoryPoint {
  static final java.lang.String _TYPE = "trajectory_msgs/JointTrajectoryPoint";
  static final java.lang.String _DEFINITION = ""
      + "# Each trajectory point specifies either positions[, velocities[, accelerations]]\n"
      + "# or positions[, effort] for the trajectory to be executed.\n"
      + "# All specified values are in the same order as the joint names in JointTrajectory.msg\n"
      + "float64[] positions\n"
      + "float64[] velocities\n"
      + "float64[] accelerations\n"
      + "float64[] effort\n"
      + "duration time_from_start\n"
      + "";
  double[] getPositions();
  void setPositions(double[] value);
  double[] getVelocities();
  void setVelocities(double[] value);
  double[] getAccelerations();
  void setAccelerations(double[] value);
  double[] getEffort();
  void setEffort(double[] value);
  org.ros.message.Duration getTimeFromStart();
  void setTimeFromStart(org.ros.message.Duration value);
}
