package geometry_msgs;

public interface Point {
  static final java.lang.String _TYPE = "geometry_msgs/Point";
  static final java.lang.String _DEFINITION = ""
      + "# This contains the position of a point in free space\n"
      + "float64 x\n"
      + "float64 y\n"
      + "float64 z\n"
      + "";
  double getX();
  void setX(double value);
  double getY();
  void setY(double value);
  double getZ();
  void setZ(double value);
}
