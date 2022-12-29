package object_recognition_msgs;

public interface GetObjectInformationRequest {
  static final java.lang.String _TYPE = "object_recognition_msgs/GetObjectInformationRequest";
  static final java.lang.String _DEFINITION = ""
      + "# Retrieve extra data from the DB for a given object\n"
      + "# The type of the object to retrieve info from\n"
      + "object_recognition_msgs/ObjectType type\n"
      + "";
  object_recognition_msgs.ObjectType getType();
  void setType(object_recognition_msgs.ObjectType value);
}
