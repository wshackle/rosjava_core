package trajectory_msgs;

public interface MultiDOFJointTrajectory {
  static final java.lang.String _TYPE = "trajectory_msgs/MultiDOFJointTrajectory";
  static final java.lang.String _DEFINITION = ""
      + "# The header is used to specify the coordinate frame and the reference time for the trajectory durations\n"
      + "Header header\n"
      + "# A representation of a multi-dof joint trajectory (each point is a transformation)\n"
      + "# Each point along the trajectory will include an array of positions/velocities/accelerations\n"
      + "# that has the same length as the array of joint names, and has the same order of joints as \n"
      + "# the joint names array.\n"
      + "string[] joint_names\n"
      + "MultiDOFJointTrajectoryPoint[] points\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<java.lang.String> getJointNames();
  void setJointNames(java.util.List<java.lang.String> value);
  java.util.List<trajectory_msgs.MultiDOFJointTrajectoryPoint> getPoints();
  void setPoints(java.util.List<trajectory_msgs.MultiDOFJointTrajectoryPoint> value);
}
