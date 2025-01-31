package nav_msgs;

public interface OccupancyGrid {
  static final java.lang.String _TYPE = "nav_msgs/OccupancyGrid";
  static final java.lang.String _DEFINITION = ""
      + "# This represents a 2-D grid map, in which each cell represents the probability of\n"
      + "# occupancy.\n"
      + "Header header \n"
      + "#MetaData for the map\n"
      + "MapMetaData info\n"
      + "# The map data, in row-major order, starting with (0,0).  Occupancy\n"
      + "# probabilities are in the range [0,100].  Unknown is -1.\n"
      + "int8[] data\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  nav_msgs.MapMetaData getInfo();
  void setInfo(nav_msgs.MapMetaData value);
  org.jboss.netty.buffer.ChannelBuffer getData();
  void setData(org.jboss.netty.buffer.ChannelBuffer value);
}
