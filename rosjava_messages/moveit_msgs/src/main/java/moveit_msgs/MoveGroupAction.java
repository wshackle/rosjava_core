package moveit_msgs;

public interface MoveGroupAction {
  static final java.lang.String _TYPE = "moveit_msgs/MoveGroupAction";
  static final java.lang.String _DEFINITION = ""
      + "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n"
      + "MoveGroupActionGoal action_goal\n"
      + "MoveGroupActionResult action_result\n"
      + "MoveGroupActionFeedback action_feedback\n"
      + "";
  moveit_msgs.MoveGroupActionGoal getActionGoal();
  void setActionGoal(moveit_msgs.MoveGroupActionGoal value);
  moveit_msgs.MoveGroupActionResult getActionResult();
  void setActionResult(moveit_msgs.MoveGroupActionResult value);
  moveit_msgs.MoveGroupActionFeedback getActionFeedback();
  void setActionFeedback(moveit_msgs.MoveGroupActionFeedback value);
}
