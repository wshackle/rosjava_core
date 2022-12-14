package motoman_msgs;

public interface ReadGroupIOResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/ReadGroupIOResponse";
  static final java.lang.String _DEFINITION = "string message\nbool success\nuint8 value";
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
  boolean getSuccess();
  void setSuccess(boolean value);
  byte getValue();
  void setValue(byte value);
}
