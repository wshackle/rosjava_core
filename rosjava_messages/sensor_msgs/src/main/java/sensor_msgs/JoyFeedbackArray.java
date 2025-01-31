package sensor_msgs;

public interface JoyFeedbackArray {
  static final java.lang.String _TYPE = "sensor_msgs/JoyFeedbackArray";
  static final java.lang.String _DEFINITION = ""
      + "# This message publishes values for multiple feedback at once. \n"
      + "JoyFeedback[] array\n"
      + "";
  java.util.List<sensor_msgs.JoyFeedback> getArray();
  void setArray(java.util.List<sensor_msgs.JoyFeedback> value);
}
