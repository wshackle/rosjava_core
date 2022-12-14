package industrial_msgs;

public interface RobotMode extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/RobotMode";
  static final java.lang.String _DEFINITION = "# The Robot mode message encapsulates the mode/teach state of the robot\n# Typically this is controlled by the pendant key switch, but not always\n\nint8 val\n\n# enumerated values\nint8 UNKNOWN=-1                 # Unknown or unavailable         \nint8 MANUAL=1 \t\t\t # Teach OR manual mode\nint8 AUTO=2                     # Automatic mode\n\n";
  static final byte UNKNOWN = -1;
  static final byte MANUAL = 1;
  static final byte AUTO = 2;
  byte getVal();
  void setVal(byte value);
}
