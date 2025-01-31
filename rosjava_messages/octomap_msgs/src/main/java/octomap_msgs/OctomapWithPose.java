package octomap_msgs;

public interface OctomapWithPose {
  static final java.lang.String _TYPE = "octomap_msgs/OctomapWithPose";
  static final java.lang.String _DEFINITION = ""
      + "# A 3D map in binary format, as Octree\n"
      + "Header header\n"
      + "# The pose of the octree with respect to the header frame \n"
      + "geometry_msgs/Pose origin\n"
      + "# The actual octree msg\n"
      + "octomap_msgs/Octomap octomap\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Pose getOrigin();
  void setOrigin(geometry_msgs.Pose value);
  octomap_msgs.Octomap getOctomap();
  void setOctomap(octomap_msgs.Octomap value);
}
