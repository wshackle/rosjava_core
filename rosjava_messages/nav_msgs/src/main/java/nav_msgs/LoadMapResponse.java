package nav_msgs;

public interface LoadMapResponse {
  static final java.lang.String _TYPE = "nav_msgs/LoadMapResponse";
  static final java.lang.String _DEFINITION = ""
      + "# Result code defintions\n"
      + "uint8 RESULT_SUCCESS=0\n"
      + "uint8 RESULT_MAP_DOES_NOT_EXIST=1\n"
      + "uint8 RESULT_INVALID_MAP_DATA=2\n"
      + "uint8 RESULT_INVALID_MAP_METADATA=3\n"
      + "uint8 RESULT_UNDEFINED_FAILURE=255\n"
      + "# Returned map is only valid if result equals RESULT_SUCCESS\n"
      + "nav_msgs/OccupancyGrid map\n"
      + "uint8 result\n"
      + "";
  static final byte RESULT_SUCCESS = 0;
  static final byte RESULT_MAP_DOES_NOT_EXIST = 1;
  static final byte RESULT_INVALID_MAP_DATA = 2;
  static final byte RESULT_INVALID_MAP_METADATA = 3;
  static final byte RESULT_UNDEFINED_FAILURE = -1;
  nav_msgs.OccupancyGrid getMap();
  void setMap(nav_msgs.OccupancyGrid value);
  byte getResult();
  void setResult(byte value);
}
