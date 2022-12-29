package sensor_msgs;

public interface PointField {
  static final java.lang.String _TYPE = "sensor_msgs/PointField";
  static final java.lang.String _DEFINITION = ""
      + "# This message holds the description of one point entry in the\n"
      + "# PointCloud2 message format.\n"
      + "uint8 INT8    = 1\n"
      + "uint8 UINT8   = 2\n"
      + "uint8 INT16   = 3\n"
      + "uint8 UINT16  = 4\n"
      + "uint8 INT32   = 5\n"
      + "uint8 UINT32  = 6\n"
      + "uint8 FLOAT32 = 7\n"
      + "uint8 FLOAT64 = 8\n"
      + "string name      # Name of field\n"
      + "uint32 offset    # Offset from start of point struct\n"
      + "uint8  datatype  # Datatype enumeration, see above\n"
      + "uint32 count     # How many elements in the field\n"
      + "";
  static final byte INT8 = 1;
  static final byte UINT8 = 2;
  static final byte INT16 = 3;
  static final byte UINT16 = 4;
  static final byte INT32 = 5;
  static final byte UINT32 = 6;
  static final byte FLOAT32 = 7;
  static final byte FLOAT64 = 8;
  java.lang.String getName();
  void setName(java.lang.String value);
  int getOffset();
  void setOffset(int value);
  byte getDatatype();
  void setDatatype(byte value);
  int getCount();
  void setCount(int value);
}
