package moveit_msgs;

public interface MoveGroupSequenceFeedback {
  static final java.lang.String _TYPE = "moveit_msgs/MoveGroupSequenceFeedback";
  static final java.lang.String _DEFINITION = ""
      + "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n"
      + "#feedback definition\n"
      + "# The internal state that the move group action currently is in\n"
      + "string state\n"
      + "";
  java.lang.String getState();
  void setState(java.lang.String value);
}
