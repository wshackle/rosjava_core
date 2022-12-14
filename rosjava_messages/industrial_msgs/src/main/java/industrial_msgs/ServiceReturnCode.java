package industrial_msgs;

public interface ServiceReturnCode extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/ServiceReturnCode";
  static final java.lang.String _DEFINITION = "# Service return codes for simple requests.  All ROS-Industrial service\n# replies are required to have a return code indicating success or failure\n# Specific return codes for different failure should be negative.\nint8 val\n\nint8 SUCCESS = 1\nint8 FAILURE = -1\n\n";
  static final byte SUCCESS = 1;
  static final byte FAILURE = -1;
  byte getVal();
  void setVal(byte value);
}
