package moveit_msgs;

public interface PositionConstraint {
  static final java.lang.String _TYPE = "moveit_msgs/PositionConstraint";
  static final java.lang.String _DEFINITION = ""
      + "# This message contains the definition of a position constraint.\n"
      + "Header header\n"
      + "# The robot link this constraint refers to\n"
      + "string link_name\n"
      + "# The offset (in the link frame) for the target point on the link we are planning for\n"
      + "geometry_msgs/Vector3 target_point_offset\n"
      + "# The volume this constraint refers to \n"
      + "BoundingVolume constraint_region\n"
      + "# A weighting factor for this constraint (denotes relative importance to other constraints. Closer to zero means less important)\n"
      + "float64 weight\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getLinkName();
  void setLinkName(java.lang.String value);
  geometry_msgs.Vector3 getTargetPointOffset();
  void setTargetPointOffset(geometry_msgs.Vector3 value);
  moveit_msgs.BoundingVolume getConstraintRegion();
  void setConstraintRegion(moveit_msgs.BoundingVolume value);
  double getWeight();
  void setWeight(double value);
}
