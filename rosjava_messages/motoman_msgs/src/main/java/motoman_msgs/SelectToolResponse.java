package motoman_msgs;

public interface SelectToolResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/SelectToolResponse";
  static final java.lang.String _DEFINITION = "\n# A human-readable error message, or an empty string if there was no error.\nstring message\n\n# true IFF invocation of the MotoROS service was successful.\n#\n# NOTE: this is independent of whether the ROS service invocation was\n#       successful. In absence of any ROS middleware failures, a failed MotoROS\n#       service invocation will result in \'success\' here being set to \'false\',\n#       but a successful ROS service invocation.\nbool success";
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
  boolean getSuccess();
  void setSuccess(boolean value);
}
