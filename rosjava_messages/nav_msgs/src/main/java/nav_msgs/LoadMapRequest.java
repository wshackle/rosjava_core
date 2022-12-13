package nav_msgs;

public interface LoadMapRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "nav_msgs/LoadMapRequest";
  static final java.lang.String _DEFINITION = "# URL of map resource\n# Can be an absolute path to a file: file:///path/to/maps/floor1.yaml\n# Or, relative to a ROS package: package://my_ros_package/maps/floor2.yaml\nstring map_url\n";
  java.lang.String getMapUrl();
  void setMapUrl(java.lang.String value);
}
