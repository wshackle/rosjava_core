package moveit_msgs;

public interface ExecuteTrajectoryActionResult {
  static final java.lang.String _TYPE = "moveit_msgs/ExecuteTrajectoryActionResult";
  static final java.lang.String _DEFINITION = ""
      + "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n"
      + "Header header\n"
      + "actionlib_msgs/GoalStatus status\n"
      + "moveit_msgs/ExecuteTrajectoryResult result\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  moveit_msgs.ExecuteTrajectoryResult getResult();
  void setResult(moveit_msgs.ExecuteTrajectoryResult value);
}
