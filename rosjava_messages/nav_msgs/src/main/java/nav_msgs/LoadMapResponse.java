package nav_msgs;

public interface LoadMapResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "nav_msgs/LoadMapResponse";
  static final java.lang.String _DEFINITION = "# Result code defintions\nuint8 RESULT_SUCCESS=0\nuint8 RESULT_MAP_DOES_NOT_EXIST=1\nuint8 RESULT_INVALID_MAP_DATA=2\nuint8 RESULT_INVALID_MAP_METADATA=3\nuint8 RESULT_UNDEFINED_FAILURE=255\n\n# Returned map is only valid if result equals RESULT_SUCCESS\nnav_msgs/OccupancyGrid map\nuint8 result";
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
