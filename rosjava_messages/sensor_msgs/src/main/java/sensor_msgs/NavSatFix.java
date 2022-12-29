package sensor_msgs;

public interface NavSatFix {
  static final java.lang.String _TYPE = "sensor_msgs/NavSatFix";
  static final java.lang.String _DEFINITION = ""
      + "# Navigation Satellite fix for any Global Navigation Satellite System\n"
      + "#\n"
      + "# Specified using the WGS 84 reference ellipsoid\n"
      + "# header.stamp specifies the ROS time for this measurement (the\n"
      + "#        corresponding satellite time may be reported using the\n"
      + "#        sensor_msgs/TimeReference message).\n"
      + "#\n"
      + "# header.frame_id is the frame of reference reported by the satellite\n"
      + "#        receiver, usually the location of the antenna.  This is a\n"
      + "#        Euclidean frame relative to the vehicle, not a reference\n"
      + "#        ellipsoid.\n"
      + "Header header\n"
      + "# satellite fix status information\n"
      + "NavSatStatus status\n"
      + "# Latitude [degrees]. Positive is north of equator; negative is south.\n"
      + "float64 latitude\n"
      + "# Longitude [degrees]. Positive is east of prime meridian; negative is west.\n"
      + "float64 longitude\n"
      + "# Altitude [m]. Positive is above the WGS 84 ellipsoid\n"
      + "# (quiet NaN if no altitude is available).\n"
      + "float64 altitude\n"
      + "# Position covariance [m^2] defined relative to a tangential plane\n"
      + "# through the reported position. The components are East, North, and\n"
      + "# Up (ENU), in row-major order.\n"
      + "#\n"
      + "# Beware: this coordinate system exhibits singularities at the poles.\n"
      + "float64[9] position_covariance\n"
      + "# If the covariance of the fix is known, fill it in completely. If the\n"
      + "# GPS receiver provides the variance of each measurement, put them\n"
      + "# along the diagonal. If only Dilution of Precision is available,\n"
      + "# estimate an approximate covariance from that.\n"
      + "uint8 COVARIANCE_TYPE_UNKNOWN = 0\n"
      + "uint8 COVARIANCE_TYPE_APPROXIMATED = 1\n"
      + "uint8 COVARIANCE_TYPE_DIAGONAL_KNOWN = 2\n"
      + "uint8 COVARIANCE_TYPE_KNOWN = 3\n"
      + "uint8 position_covariance_type\n"
      + "";
  static final byte COVARIANCE_TYPE_UNKNOWN = 0;
  static final byte COVARIANCE_TYPE_APPROXIMATED = 1;
  static final byte COVARIANCE_TYPE_DIAGONAL_KNOWN = 2;
  static final byte COVARIANCE_TYPE_KNOWN = 3;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  sensor_msgs.NavSatStatus getStatus();
  void setStatus(sensor_msgs.NavSatStatus value);
  double getLatitude();
  void setLatitude(double value);
  double getLongitude();
  void setLongitude(double value);
  double getAltitude();
  void setAltitude(double value);
  double[] getPositionCovariance();
  void setPositionCovariance(double[] value);
  byte getPositionCovarianceType();
  void setPositionCovarianceType(byte value);
}
