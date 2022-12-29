package octomap_msgs;

public interface Octomap {
  static final java.lang.String _TYPE = "octomap_msgs/Octomap";
  static final java.lang.String _DEFINITION = ""
      + "# A 3D map in binary format, as Octree\n"
      + "Header header\n"
      + "# Flag to denote a binary (only free/occupied) or full occupancy octree (.bt/.ot file)\n"
      + "bool binary\n"
      + "# Class id of the contained octree \n"
      + "string id\n"
      + "# Resolution (in m) of the smallest octree nodes\n"
      + "float64 resolution\n"
      + "# binary serialization of octree, use conversions.h to read and write octrees\n"
      + "int8[] data\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  boolean getBinary();
  void setBinary(boolean value);
  java.lang.String getId();
  void setId(java.lang.String value);
  double getResolution();
  void setResolution(double value);
  org.jboss.netty.buffer.ChannelBuffer getData();
  void setData(org.jboss.netty.buffer.ChannelBuffer value);
}
