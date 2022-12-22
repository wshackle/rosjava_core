package moveit_msgs;

public interface MoveGroup {
  static final java.lang.String _TYPE = "moveit_msgs/MoveGroup";
  static final java.lang.String _DEFINITION = ""
      + "# Motion planning request to pass to planner\n"
      + "MotionPlanRequest request\n"
      + "# Planning options\n"
      + "PlanningOptions planning_options\n"
      + "---\n"
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
      + "---\n"
      + "# The internal state that the move group action currently is in\n"
      + "string state\n"
      + "";
}
