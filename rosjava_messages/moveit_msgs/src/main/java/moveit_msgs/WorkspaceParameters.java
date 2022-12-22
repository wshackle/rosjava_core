package moveit_msgs;

public interface WorkspaceParameters {
  static final java.lang.String _TYPE = "moveit_msgs/WorkspaceParameters";
  static final java.lang.String _DEFINITION = ""
      + "# This message contains a set of parameters useful in\n"
      + "# setting up the volume (a box) in which the robot is allowed to move.\n"
      + "# This is useful only when planning for mobile parts of \n"
      + "# the robot as well.\n"
      + "# Define the frame of reference for the box corners\n"
      + "Header header\n"
      + "# The minumum corner of the box, with respect to the robot starting pose\n"
      + "geometry_msgs/Vector3 min_corner\n"
      + "# The maximum corner of the box, with respect to the robot starting pose\n"
      + "geometry_msgs/Vector3 max_corner\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Vector3 getMinCorner();
  void setMinCorner(geometry_msgs.Vector3 value);
  geometry_msgs.Vector3 getMaxCorner();
  void setMaxCorner(geometry_msgs.Vector3 value);
}
