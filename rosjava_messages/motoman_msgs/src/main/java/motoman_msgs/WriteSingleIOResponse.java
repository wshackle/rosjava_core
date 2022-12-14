package motoman_msgs;

public interface WriteSingleIOResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/WriteSingleIOResponse";
  static final java.lang.String _DEFINITION = "string message\nbool success";
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
  boolean getSuccess();
  void setSuccess(boolean value);
}
