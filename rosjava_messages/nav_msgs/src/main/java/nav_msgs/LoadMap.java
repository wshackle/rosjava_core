package nav_msgs;

public interface LoadMap {
  static final java.lang.String _TYPE = "nav_msgs/LoadMap";
  static final java.lang.String _DEFINITION = ""
      + "# URL of map resource\n"
      + "# Can be an absolute path to a file: file:///path/to/maps/floor1.yaml\n"
      + "# Or, relative to a ROS package: package://my_ros_package/maps/floor2.yaml\n"
      + "string map_url\n"
      + "---\n"
      + "# Result code defintions\n"
      + "uint8 RESULT_SUCCESS=0\n"
      + "uint8 RESULT_MAP_DOES_NOT_EXIST=1\n"
      + "uint8 RESULT_INVALID_MAP_DATA=2\n"
      + "uint8 RESULT_INVALID_MAP_METADATA=3\n"
      + "uint8 RESULT_UNDEFINED_FAILURE=255\n"
      + "# Returned map is only valid if result equals RESULT_SUCCESS\n"
      + "nav_msgs/OccupancyGrid map\n"
      + "uint8 result\n"
      + "";
}
