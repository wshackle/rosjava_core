package moveit_msgs;

public interface Constraints {
  static final java.lang.String _TYPE = "moveit_msgs/Constraints";
  static final java.lang.String _DEFINITION = ""
      + "# This message contains a list of motion planning constraints.\n"
      + "# All constraints must be satisfied for a goal to be considered valid\n"
      + "string name\n"
      + "JointConstraint[] joint_constraints\n"
      + "PositionConstraint[] position_constraints\n"
      + "OrientationConstraint[] orientation_constraints\n"
      + "VisibilityConstraint[] visibility_constraints\n"
      + "";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.util.List<moveit_msgs.JointConstraint> getJointConstraints();
  void setJointConstraints(java.util.List<moveit_msgs.JointConstraint> value);
  java.util.List<moveit_msgs.PositionConstraint> getPositionConstraints();
  void setPositionConstraints(java.util.List<moveit_msgs.PositionConstraint> value);
  java.util.List<moveit_msgs.OrientationConstraint> getOrientationConstraints();
  void setOrientationConstraints(java.util.List<moveit_msgs.OrientationConstraint> value);
  java.util.List<moveit_msgs.VisibilityConstraint> getVisibilityConstraints();
  void setVisibilityConstraints(java.util.List<moveit_msgs.VisibilityConstraint> value);
}
