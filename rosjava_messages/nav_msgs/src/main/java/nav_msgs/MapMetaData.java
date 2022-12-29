package nav_msgs;

public interface MapMetaData {
  static final java.lang.String _TYPE = "nav_msgs/MapMetaData";
  static final java.lang.String _DEFINITION = ""
      + "# This hold basic information about the characterists of the OccupancyGrid\n"
      + "# The time at which the map was loaded\n"
      + "time map_load_time\n"
      + "# The map resolution [m/cell]\n"
      + "float32 resolution\n"
      + "# Map width [cells]\n"
      + "uint32 width\n"
      + "# Map height [cells]\n"
      + "uint32 height\n"
      + "# The origin of the map [m, m, rad].  This is the real-world pose of the\n"
      + "# cell (0,0) in the map.\n"
      + "geometry_msgs/Pose origin\n"
      + "";
  org.ros.message.Time getMapLoadTime();
  void setMapLoadTime(org.ros.message.Time value);
  float getResolution();
  void setResolution(float value);
  int getWidth();
  void setWidth(int value);
  int getHeight();
  void setHeight(int value);
  geometry_msgs.Pose getOrigin();
  void setOrigin(geometry_msgs.Pose value);
}
