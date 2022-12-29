package nav_msgs;

public interface SetMap {
  static final java.lang.String _TYPE = "nav_msgs/SetMap";
  static final java.lang.String _DEFINITION = ""
      + "# Set a new map together with an initial pose\n"
      + "nav_msgs/OccupancyGrid map\n"
      + "geometry_msgs/PoseWithCovarianceStamped initial_pose\n"
      + "---\n"
      + "bool success\n"
      + "";
}
