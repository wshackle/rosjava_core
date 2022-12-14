package moveit_msgs;

public interface MotionSequenceResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/MotionSequenceResponse";
  static final java.lang.String _DEFINITION = "# An error code reflecting what went wrong\nMoveItErrorCodes error_code\n\n# The full starting state of the robot at the start of the sequence\nRobotState sequence_start\n\n# The trajectories that the planner produced for execution\nRobotTrajectory[] planned_trajectories\n\n# The amount of time it took to complete the motion plan\nfloat64 planning_time\n";
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
  moveit_msgs.RobotState getSequenceStart();
  void setSequenceStart(moveit_msgs.RobotState value);
  java.util.List<moveit_msgs.RobotTrajectory> getPlannedTrajectories();
  void setPlannedTrajectories(java.util.List<moveit_msgs.RobotTrajectory> value);
  double getPlanningTime();
  void setPlanningTime(double value);
}
