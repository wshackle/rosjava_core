package sensor_msgs;

public interface SetCameraInfoResponse {
  static final java.lang.String _TYPE = "sensor_msgs/SetCameraInfoResponse";
  static final java.lang.String _DEFINITION = ""
      + "bool success          # True if the call succeeded\n"
      + "string status_message # Used to give details about success\n"
      + "";
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getStatusMessage();
  void setStatusMessage(java.lang.String value);
}
