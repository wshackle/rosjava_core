package sensor_msgs;

public interface LaserEcho {
  static final java.lang.String _TYPE = "sensor_msgs/LaserEcho";
  static final java.lang.String _DEFINITION = ""
      + "# This message is a submessage of MultiEchoLaserScan and is not intended\n"
      + "# to be used separately.\n"
      + "float32[] echoes  # Multiple values of ranges or intensities.\n"
      + "                  # Each array represents data from the same angle increment.\n"
      + "";
  float[] getEchoes();
  void setEchoes(float[] value);
}
