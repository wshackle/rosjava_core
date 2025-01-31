package geometry_msgs;

public interface Point32 {
  static final java.lang.String _TYPE = "geometry_msgs/Point32";
  static final java.lang.String _DEFINITION = ""
      + "# This contains the position of a point in free space(with 32 bits of precision).\n"
      + "# It is recommeded to use Point wherever possible instead of Point32.  \n"
      + "# \n"
      + "# This recommendation is to promote interoperability.  \n"
      + "#\n"
      + "# This message is designed to take up less space when sending\n"
      + "# lots of points at once, as in the case of a PointCloud.  \n"
      + "float32 x\n"
      + "float32 y\n"
      + "float32 z\n"
      + "";
  float getX();
  void setX(float value);
  float getY();
  void setY(float value);
  float getZ();
  void setZ(float value);
}
