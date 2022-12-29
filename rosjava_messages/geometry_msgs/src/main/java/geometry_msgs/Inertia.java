package geometry_msgs;

public interface Inertia {
  static final java.lang.String _TYPE = "geometry_msgs/Inertia";
  static final java.lang.String _DEFINITION = ""
      + "# Mass [kg]\n"
      + "float64 m\n"
      + "# Center of mass [m]\n"
      + "geometry_msgs/Vector3 com\n"
      + "# Inertia Tensor [kg-m^2]\n"
      + "#     | ixx ixy ixz |\n"
      + "# I = | ixy iyy iyz |\n"
      + "#     | ixz iyz izz |\n"
      + "float64 ixx\n"
      + "float64 ixy\n"
      + "float64 ixz\n"
      + "float64 iyy\n"
      + "float64 iyz\n"
      + "float64 izz\n"
      + "";
  double getM();
  void setM(double value);
  geometry_msgs.Vector3 getCom();
  void setCom(geometry_msgs.Vector3 value);
  double getIxx();
  void setIxx(double value);
  double getIxy();
  void setIxy(double value);
  double getIxz();
  void setIxz(double value);
  double getIyy();
  void setIyy(double value);
  double getIyz();
  void setIyz(double value);
  double getIzz();
  void setIzz(double value);
}
