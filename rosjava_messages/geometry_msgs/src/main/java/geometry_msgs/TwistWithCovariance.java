package geometry_msgs;

public interface TwistWithCovariance {
  static final java.lang.String _TYPE = "geometry_msgs/TwistWithCovariance";
  static final java.lang.String _DEFINITION = ""
      + "# This expresses velocity in free space with uncertainty.\n"
      + "Twist twist\n"
      + "# Row-major representation of the 6x6 covariance matrix\n"
      + "# The orientation parameters use a fixed-axis representation.\n"
      + "# In order, the parameters are:\n"
      + "# (x, y, z, rotation about X axis, rotation about Y axis, rotation about Z axis)\n"
      + "float64[36] covariance\n"
      + "";
  geometry_msgs.Twist getTwist();
  void setTwist(geometry_msgs.Twist value);
  double[] getCovariance();
  void setCovariance(double[] value);
}
