package moveit_msgs;

public interface PickupFeedback {
  static final java.lang.String _TYPE = "moveit_msgs/PickupFeedback";
  static final java.lang.String _DEFINITION = ""
      + "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n"
      + "#feedback definition\n"
      + "# The internal state that the pickup action currently is in\n"
      + "string state\n"
      + "";
  java.lang.String getState();
  void setState(java.lang.String value);
}
