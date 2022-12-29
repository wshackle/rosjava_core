package sensor_msgs;

public interface LaserScan {
  static final java.lang.String _TYPE = "sensor_msgs/LaserScan";
  static final java.lang.String _DEFINITION = ""
      + "# Single scan from a planar laser range-finder\n"
      + "#\n"
      + "# If you have another ranging device with different behavior (e.g. a sonar\n"
      + "# array), please find or create a different message, since applications\n"
      + "# will make fairly laser-specific assumptions about this data\n"
      + "Header header            # timestamp in the header is the acquisition time of \n"
      + "                         # the first ray in the scan.\n"
      + "                         #\n"
      + "                         # in frame frame_id, angles are measured around \n"
      + "                         # the positive Z axis (counterclockwise, if Z is up)\n"
      + "                         # with zero angle being forward along the x axis\n"
      + "                         \n"
      + "float32 angle_min        # start angle of the scan [rad]\n"
      + "float32 angle_max        # end angle of the scan [rad]\n"
      + "float32 angle_increment  # angular distance between measurements [rad]\n"
      + "float32 time_increment   # time between measurements [seconds] - if your scanner\n"
      + "                         # is moving, this will be used in interpolating position\n"
      + "                         # of 3d points\n"
      + "float32 scan_time        # time between scans [seconds]\n"
      + "float32 range_min        # minimum range value [m]\n"
      + "float32 range_max        # maximum range value [m]\n"
      + "float32[] ranges         # range data [m] (Note: values < range_min or > range_max should be discarded)\n"
      + "float32[] intensities    # intensity data [device-specific units].  If your\n"
      + "                         # device does not provide intensities, please leave\n"
      + "                         # the array empty.\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getAngleMin();
  void setAngleMin(float value);
  float getAngleMax();
  void setAngleMax(float value);
  float getAngleIncrement();
  void setAngleIncrement(float value);
  float getTimeIncrement();
  void setTimeIncrement(float value);
  float getScanTime();
  void setScanTime(float value);
  float getRangeMin();
  void setRangeMin(float value);
  float getRangeMax();
  void setRangeMax(float value);
  float[] getRanges();
  void setRanges(float[] value);
  float[] getIntensities();
  void setIntensities(float[] value);
}
