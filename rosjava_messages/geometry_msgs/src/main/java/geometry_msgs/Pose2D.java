package geometry_msgs;

public interface Pose2D {
  static final java.lang.String _TYPE = "geometry_msgs/Pose2D";
  static final java.lang.String _DEFINITION = ""
      + "# Deprecated\n"
      + "# Please use the full 3D pose.\n"
      + "# In general our recommendation is to use a full 3D representation of everything and for 2D specific applications make the appropriate projections into the plane for their calculations but optimally will preserve the 3D information during processing.\n"
      + "# If we have parallel copies of 2D datatypes every UI and other pipeline will end up needing to have dual interfaces to plot everything. And you will end up with not being able to use 3D tools for 2D use cases even if they\'re completely valid, as you\'d have to reimplement it with different inputs and outputs. It\'s not particularly hard to plot the 2D pose or compute the yaw error for the Pose message and there are already tools and libraries that can do this for you.\n"
      + "# This expresses a position and orientation on a 2D manifold.\n"
      + "float64 x\n"
      + "float64 y\n"
      + "float64 theta\n"
      + "";
  double getX();
  void setX(double value);
  double getY();
  void setY(double value);
  double getTheta();
  void setTheta(double value);
}
