package nav_msgs;

public interface GetMapActionGoal {
  static final java.lang.String _TYPE = "nav_msgs/GetMapActionGoal";
  static final java.lang.String _DEFINITION = ""
      + "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n"
      + "Header header\n"
      + "actionlib_msgs/GoalID goal_id\n"
      + "nav_msgs/GetMapGoal goal\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalID getGoalId();
  void setGoalId(actionlib_msgs.GoalID value);
  nav_msgs.GetMapGoal getGoal();
  void setGoal(nav_msgs.GetMapGoal value);
}
