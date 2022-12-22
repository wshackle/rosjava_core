package moveit_msgs;

public interface ExecuteKnownTrajectoryResponse {
  static final java.lang.String _TYPE = "moveit_msgs/ExecuteKnownTrajectoryResponse";
  static final java.lang.String _DEFINITION = ""
      + "# Error code - encodes the overall reason for failure\n"
      + "MoveItErrorCodes error_code\n"
      + "";
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
