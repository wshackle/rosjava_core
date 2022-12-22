package moveit_msgs;

public interface AttachedCollisionObject {
  static final java.lang.String _TYPE = "moveit_msgs/AttachedCollisionObject";
  static final java.lang.String _DEFINITION = ""
      + "# The CollisionObject will be attached with a fixed joint to this link\n"
      + "string link_name\n"
      + "#This contains the actual shapes and poses for the CollisionObject\n"
      + "#to be attached to the link\n"
      + "#If action is remove and no object.id is set, all objects\n"
      + "#attached to the link indicated by link_name will be removed\n"
      + "CollisionObject object\n"
      + "# The set of links that the attached objects are allowed to touch\n"
      + "# by default - the link_name is already considered by default\n"
      + "string[] touch_links\n"
      + "# If certain links were placed in a particular posture for this object to remain attached \n"
      + "# (e.g., an end effector closing around an object), the posture necessary for releasing\n"
      + "# the object is stored here\n"
      + "trajectory_msgs/JointTrajectory detach_posture\n"
      + "# The weight of the attached object, if known\n"
      + "float64 weight\n"
      + "";
  java.lang.String getLinkName();
  void setLinkName(java.lang.String value);
  moveit_msgs.CollisionObject getObject();
  void setObject(moveit_msgs.CollisionObject value);
  java.util.List<java.lang.String> getTouchLinks();
  void setTouchLinks(java.util.List<java.lang.String> value);
  trajectory_msgs.JointTrajectory getDetachPosture();
  void setDetachPosture(trajectory_msgs.JointTrajectory value);
  double getWeight();
  void setWeight(double value);
}
