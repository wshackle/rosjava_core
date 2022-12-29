package geometry_msgs;

public interface Quaternion {
  static final java.lang.String _TYPE = "geometry_msgs/Quaternion";
  static final java.lang.String _DEFINITION = ""
      + "# This represents an orientation in free space in quaternion form.\n"
      + "float64 x\n"
      + "float64 y\n"
      + "float64 z\n"
      + "float64 w\n"
      + "";
  double getX();
  void setX(double value);
  double getY();
  void setY(double value);
  double getZ();
  void setZ(double value);
  double getW();
  void setW(double value);
}
