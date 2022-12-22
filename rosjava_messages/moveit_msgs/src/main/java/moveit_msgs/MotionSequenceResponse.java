package moveit_msgs;

public interface MotionSequenceResponse {
  static final java.lang.String _TYPE = "moveit_msgs/MotionSequenceResponse";
  static final java.lang.String _DEFINITION = ""
      + "# An error code reflecting what went wrong\n"
      + "MoveItErrorCodes error_code\n"
      + "# The full starting state of the robot at the start of the sequence\n"
      + "RobotState sequence_start\n"
      + "# The trajectories that the planner produced for execution\n"
      + "RobotTrajectory[] planned_trajectories\n"
      + "# The amount of time it took to complete the motion plan\n"
      + "float64 planning_time\n"
      + "";
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
  moveit_msgs.RobotState getSequenceStart();
  void setSequenceStart(moveit_msgs.RobotState value);
  java.util.List<moveit_msgs.RobotTrajectory> getPlannedTrajectories();
  void setPlannedTrajectories(java.util.List<moveit_msgs.RobotTrajectory> value);
  double getPlanningTime();
  void setPlanningTime(double value);
}
