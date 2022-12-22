package moveit_msgs;

public interface MotionPlanDetailedResponse {
  static final java.lang.String _TYPE = "moveit_msgs/MotionPlanDetailedResponse";
  static final java.lang.String _DEFINITION = ""
      + "# The representation of a solution to a planning problem, including intermediate data\n"
      + "# The starting state considered for the robot solution path\n"
      + "RobotState trajectory_start\n"
      + "# The group used for planning (usually the same as in the request)\n"
      + "string group_name\n"
      + "# Multiple solution paths are reported, each reflecting intermediate steps in the trajectory processing\n"
      + "# The list of reported trajectories\n"
      + "RobotTrajectory[] trajectory\n"
      + "# Description of the reported trajectories (name of processing step)\n"
      + "string[] description\n"
      + "# The amount of time spent computing a particular step in motion plan computation \n"
      + "float64[] processing_time\n"
      + "# Status at the end of this plan\n"
      + "MoveItErrorCodes error_code\n"
      + "";
  moveit_msgs.RobotState getTrajectoryStart();
  void setTrajectoryStart(moveit_msgs.RobotState value);
  java.lang.String getGroupName();
  void setGroupName(java.lang.String value);
  java.util.List<moveit_msgs.RobotTrajectory> getTrajectory();
  void setTrajectory(java.util.List<moveit_msgs.RobotTrajectory> value);
  java.util.List<java.lang.String> getDescription();
  void setDescription(java.util.List<java.lang.String> value);
  double[] getProcessingTime();
  void setProcessingTime(double[] value);
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
