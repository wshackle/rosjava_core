package moveit_msgs;

public interface MoveGroupActionGoal {
  static final java.lang.String _TYPE = "moveit_msgs/MoveGroupActionGoal";
  static final java.lang.String _DEFINITION = ""
      + "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n"
      + "Header header\n"
      + "actionlib_msgs/GoalID goal_id\n"
      + "moveit_msgs/MoveGroupGoal goal\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalID getGoalId();
  void setGoalId(actionlib_msgs.GoalID value);
  moveit_msgs.MoveGroupGoal getGoal();
  void setGoal(moveit_msgs.MoveGroupGoal value);
}
