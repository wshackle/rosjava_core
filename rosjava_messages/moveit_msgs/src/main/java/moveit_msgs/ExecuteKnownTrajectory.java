package moveit_msgs;

public interface ExecuteKnownTrajectory {
  static final java.lang.String _TYPE = "moveit_msgs/ExecuteKnownTrajectory";
  static final java.lang.String _DEFINITION = ""
      + "# This service is deprecated and will go away at some point. For new development use the ExecuteTrajectory action.\n"
      + "# Effective since: Indigo 0.7.4, Jade and Kinetic 0.8.3\n"
      + "# The trajectory to execute \n"
      + "RobotTrajectory trajectory\n"
      + "# Set this to true if the service should block until the execution is complete\n"
      + "bool wait_for_execution\n"
      + "---\n"
      + "# Error code - encodes the overall reason for failure\n"
      + "MoveItErrorCodes error_code\n"
      + "";
}
