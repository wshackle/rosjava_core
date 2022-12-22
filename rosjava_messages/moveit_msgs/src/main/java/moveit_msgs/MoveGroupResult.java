package moveit_msgs;

public interface MoveGroupResult {
  static final java.lang.String _TYPE = "moveit_msgs/MoveGroupResult";
  static final java.lang.String _DEFINITION = ""
      + "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n"
      + "#result definition\n"
      + "# An error code reflecting what went wrong\n"
      + "MoveItErrorCodes error_code\n"
      + "# The full starting state of the robot at the start of the trajectory\n"
      + "moveit_msgs/RobotState trajectory_start\n"
      + "# The trajectory that moved group produced for execution\n"
      + "moveit_msgs/RobotTrajectory planned_trajectory\n"
      + "# The trace of the trajectory recorded during execution\n"
      + "moveit_msgs/RobotTrajectory executed_trajectory\n"
      + "# The amount of time it took to complete the motion plan\n"
      + "float64 planning_time\n"
      + "";
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
  moveit_msgs.RobotState getTrajectoryStart();
  void setTrajectoryStart(moveit_msgs.RobotState value);
  moveit_msgs.RobotTrajectory getPlannedTrajectory();
  void setPlannedTrajectory(moveit_msgs.RobotTrajectory value);
  moveit_msgs.RobotTrajectory getExecutedTrajectory();
  void setExecutedTrajectory(moveit_msgs.RobotTrajectory value);
  double getPlanningTime();
  void setPlanningTime(double value);
}
