package moveit_msgs;

public interface GetCartesianPathResponse {
  static final java.lang.String _TYPE = "moveit_msgs/GetCartesianPathResponse";
  static final java.lang.String _DEFINITION = ""
      + "# The state at which the computed path starts\n"
      + "RobotState start_state\n"
      + "# The computed solution trajectory, for the desired group, in configuration space\n"
      + "RobotTrajectory solution\n"
      + "# If the computation was incomplete, this value indicates the fraction of the path\n"
      + "# that was in fact computed (nr of waypoints traveled through)\n"
      + "float64 fraction\n"
      + "# The error code of the computation\n"
      + "MoveItErrorCodes error_code\n"
      + "";
  moveit_msgs.RobotState getStartState();
  void setStartState(moveit_msgs.RobotState value);
  moveit_msgs.RobotTrajectory getSolution();
  void setSolution(moveit_msgs.RobotTrajectory value);
  double getFraction();
  void setFraction(double value);
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
