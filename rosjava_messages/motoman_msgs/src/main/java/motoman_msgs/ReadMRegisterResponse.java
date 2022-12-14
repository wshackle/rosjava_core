package motoman_msgs;

public interface ReadMRegisterResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/ReadMRegisterResponse";
  static final java.lang.String _DEFINITION = "string message\nbool success\nuint16 value";
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
  boolean getSuccess();
  void setSuccess(boolean value);
  short getValue();
  void setValue(short value);
}
