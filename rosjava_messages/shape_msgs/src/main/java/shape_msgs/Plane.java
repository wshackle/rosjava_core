package shape_msgs;

public interface Plane {
  static final java.lang.String _TYPE = "shape_msgs/Plane";
  static final java.lang.String _DEFINITION = ""
      + "# Representation of a plane, using the plane equation ax + by + cz + d = 0\n"
      + "# a := coef[0]\n"
      + "# b := coef[1]\n"
      + "# c := coef[2]\n"
      + "# d := coef[3]\n"
      + "float64[4] coef\n"
      + "";
  double[] getCoef();
  void setCoef(double[] value);
}
