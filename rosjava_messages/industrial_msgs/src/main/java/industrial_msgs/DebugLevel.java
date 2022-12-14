package industrial_msgs;

public interface DebugLevel extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/DebugLevel";
  static final java.lang.String _DEFINITION = "# Debug level message enumeration.  This may replicate some functionality that\n# alreay exists in the ROS logger.\n# TODO: Get more information on the ROS Logger.\nuint8 val\n\nuint8 DEBUG = 5\nuint8 INFO = 4\nuint8 WARN = 3\nuint8 ERROR = 2\nuint8 FATAL = 1\nuint8 NONE = 0 \n";
  static final byte DEBUG = 5;
  static final byte INFO = 4;
  static final byte WARN = 3;
  static final byte ERROR = 2;
  static final byte FATAL = 1;
  static final byte NONE = 0;
  byte getVal();
  void setVal(byte value);
}
