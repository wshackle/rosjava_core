package moveit_msgs;

public interface ExecuteTrajectory {
  static final java.lang.String _TYPE = "moveit_msgs/ExecuteTrajectory";
  static final java.lang.String _DEFINITION = ""
      + "# The trajectory to execute\n"
      + "RobotTrajectory trajectory\n"
      + "---\n"
      + "# Error code - encodes the overall reason for failure\n"
      + "MoveItErrorCodes error_code\n"
      + "---\n"
      + "# The internal state that the move group action currently is in\n"
      + "string state\n"
      + "";
}
