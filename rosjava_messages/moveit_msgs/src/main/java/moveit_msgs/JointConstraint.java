package moveit_msgs;

public interface JointConstraint {
  static final java.lang.String _TYPE = "moveit_msgs/JointConstraint";
  static final java.lang.String _DEFINITION = ""
      + "# Constrain the position of a joint to be within a certain bound\n"
      + "string joint_name\n"
      + "# the bound to be achieved is [position - tolerance_below, position + tolerance_above]\n"
      + "float64 position\n"
      + "float64 tolerance_above\n"
      + "float64 tolerance_below\n"
      + "# A weighting factor for this constraint (denotes relative importance to other constraints. Closer to zero means less important)\n"
      + "float64 weight\n"
      + "";
  java.lang.String getJointName();
  void setJointName(java.lang.String value);
  double getPosition();
  void setPosition(double value);
  double getToleranceAbove();
  void setToleranceAbove(double value);
  double getToleranceBelow();
  void setToleranceBelow(double value);
  double getWeight();
  void setWeight(double value);
}
