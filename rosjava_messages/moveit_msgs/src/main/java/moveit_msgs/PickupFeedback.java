package moveit_msgs;

public interface PickupFeedback extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/PickupFeedback";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n#feedback definition\n\n# The internal state that the pickup action currently is in\nstring state";
  java.lang.String getState();
  void setState(java.lang.String value);
}
