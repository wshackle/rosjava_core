package object_recognition_msgs;

public interface GetObjectInformationResponse {
  static final java.lang.String _TYPE = "object_recognition_msgs/GetObjectInformationResponse";
  static final java.lang.String _DEFINITION = ""
      + "# Extra object info \n"
      + "object_recognition_msgs/ObjectInformation information\n"
      + "";
  object_recognition_msgs.ObjectInformation getInformation();
  void setInformation(object_recognition_msgs.ObjectInformation value);
}
