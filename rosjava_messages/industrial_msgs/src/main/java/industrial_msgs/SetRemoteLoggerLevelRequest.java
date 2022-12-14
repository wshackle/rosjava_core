package industrial_msgs;

public interface SetRemoteLoggerLevelRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/SetRemoteLoggerLevelRequest";
  static final java.lang.String _DEFINITION = "# Sets logging level for a remote device that is attached to\n# ROS via some communications link.  This service is meant to\n# set the log level on the device directly so that the comms\n# link is not overloaded with messages.\n\nindustrial_msgs/DebugLevel level\n";
  industrial_msgs.DebugLevel getLevel();
  void setLevel(industrial_msgs.DebugLevel value);
}
