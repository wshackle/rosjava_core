package moveit_msgs;

public interface GetStateValidity {
  static final java.lang.String _TYPE = "moveit_msgs/GetStateValidity";
  static final java.lang.String _DEFINITION = ""
      + "RobotState robot_state\n"
      + "string group_name\n"
      + "Constraints constraints\n"
      + "---\n"
      + "bool valid\n"
      + "ContactInformation[] contacts\n"
      + "CostSource[] cost_sources\n"
      + "ConstraintEvalResult[] constraint_result\n"
      + "";
}
