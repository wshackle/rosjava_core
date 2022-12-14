package moveit_msgs;

public interface MotionSequenceItem extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/MotionSequenceItem";
  static final java.lang.String _DEFINITION = "# The plan request for this item.\n# It is the planning request for this segment of the sequence, as if it were a solitary motion.\nMotionPlanRequest req\n\n# To blend between sequence items, the motion may be smoothed using a circular motion.\n# The blend radius of the circle between this and the next command, where 0 means no blending.\nfloat64 blend_radius\n";
  moveit_msgs.MotionPlanRequest getReq();
  void setReq(moveit_msgs.MotionPlanRequest value);
  double getBlendRadius();
  void setBlendRadius(double value);
}
