package nav_msgs;

public interface GetMapResponse {
  static final java.lang.String _TYPE = "nav_msgs/GetMapResponse";
  static final java.lang.String _DEFINITION = ""
      + "nav_msgs/OccupancyGrid map\n"
      + "";
  nav_msgs.OccupancyGrid getMap();
  void setMap(nav_msgs.OccupancyGrid value);
}
