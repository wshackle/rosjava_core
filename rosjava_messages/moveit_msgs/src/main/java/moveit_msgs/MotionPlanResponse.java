package moveit_msgs;

public interface MotionPlanResponse {
  static final java.lang.String _TYPE = "moveit_msgs/MotionPlanResponse";
  static final java.lang.String _DEFINITION = ""
      + "# The representation of a solution to a planning problem\n"
      + "# The corresponding robot state\n"
      + "RobotState trajectory_start\n"
      + "# The group used for planning (usually the same as in the request)\n"
      + "string group_name\n"
      + "# A solution trajectory, if found\n"
      + "RobotTrajectory trajectory\n"
      + "# Planning time (seconds)\n"
      + "float64 planning_time\n"
      + "# Error code - encodes the overall reason for failure\n"
      + "MoveItErrorCodes error_code\n"
      + "";
  moveit_msgs.RobotState getTrajectoryStart();
  void setTrajectoryStart(moveit_msgs.RobotState value);
  java.lang.String getGroupName();
  void setGroupName(java.lang.String value);
  moveit_msgs.RobotTrajectory getTrajectory();
  void setTrajectory(moveit_msgs.RobotTrajectory value);
  double getPlanningTime();
  void setPlanningTime(double value);
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
