package industrial_msgs;

public interface TriState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/TriState";
  static final java.lang.String _DEFINITION = "# The tri-state captures boolean values with the additional state of unknown\n\nint8 val\n\n# enumerated values\n\n# Unknown or unavailable \nint8 UNKNOWN=-1  \n\n# High state                       \nint8 TRUE=1\nint8 ON=1\nint8 ENABLED=1\nint8 HIGH=1\nint8 CLOSED=1\n\n# Low state\nint8 FALSE=0\nint8 OFF=0\nint8 DISABLED=0\nint8 LOW=0\nint8 OPEN=0\n\n";
  static final byte UNKNOWN = -1;
  static final byte TRUE = 1;
  static final byte ON = 1;
  static final byte ENABLED = 1;
  static final byte HIGH = 1;
  static final byte CLOSED = 1;
  static final byte FALSE = 0;
  static final byte OFF = 0;
  static final byte DISABLED = 0;
  static final byte LOW = 0;
  static final byte OPEN = 0;
  byte getVal();
  void setVal(byte value);
}
