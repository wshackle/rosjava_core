package moveit_msgs;

public interface ExecuteKnownTrajectoryRequest {
  static final java.lang.String _TYPE = "moveit_msgs/ExecuteKnownTrajectoryRequest";
  static final java.lang.String _DEFINITION = ""
      + "# This service is deprecated and will go away at some point. For new development use the ExecuteTrajectory action.\n"
      + "# Effective since: Indigo 0.7.4, Jade and Kinetic 0.8.3\n"
      + "# The trajectory to execute \n"
      + "RobotTrajectory trajectory\n"
      + "# Set this to true if the service should block until the execution is complete\n"
      + "bool wait_for_execution\n"
      + "";
  moveit_msgs.RobotTrajectory getTrajectory();
  void setTrajectory(moveit_msgs.RobotTrajectory value);
  boolean getWaitForExecution();
  void setWaitForExecution(boolean value);
}
