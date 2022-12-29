package sensor_msgs;

public interface NavSatStatus {
  static final java.lang.String _TYPE = "sensor_msgs/NavSatStatus";
  static final java.lang.String _DEFINITION = ""
      + "# Navigation Satellite fix status for any Global Navigation Satellite System\n"
      + "# Whether to output an augmented fix is determined by both the fix\n"
      + "# type and the last time differential corrections were received.  A\n"
      + "# fix is valid when status >= STATUS_FIX.\n"
      + "int8 STATUS_NO_FIX =  -1        # unable to fix position\n"
      + "int8 STATUS_FIX =      0        # unaugmented fix\n"
      + "int8 STATUS_SBAS_FIX = 1        # with satellite-based augmentation\n"
      + "int8 STATUS_GBAS_FIX = 2        # with ground-based augmentation\n"
      + "int8 status\n"
      + "# Bits defining which Global Navigation Satellite System signals were\n"
      + "# used by the receiver.\n"
      + "uint16 SERVICE_GPS =     1\n"
      + "uint16 SERVICE_GLONASS = 2\n"
      + "uint16 SERVICE_COMPASS = 4      # includes BeiDou.\n"
      + "uint16 SERVICE_GALILEO = 8\n"
      + "uint16 service\n"
      + "";
  static final byte STATUS_NO_FIX = -1;
  static final byte STATUS_FIX = 0;
  static final byte STATUS_SBAS_FIX = 1;
  static final byte STATUS_GBAS_FIX = 2;
  static final short SERVICE_GPS = 1;
  static final short SERVICE_GLONASS = 2;
  static final short SERVICE_COMPASS = 4;
  static final short SERVICE_GALILEO = 8;
  byte getStatus();
  void setStatus(byte value);
  short getService();
  void setService(short value);
}
