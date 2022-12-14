package motoman_msgs;

public interface ReadSingleIOResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/ReadSingleIOResponse";
  static final java.lang.String _DEFINITION = "string message\nbool success\nint32 value";
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
  boolean getSuccess();
  void setSuccess(boolean value);
  int getValue();
  void setValue(int value);
}
