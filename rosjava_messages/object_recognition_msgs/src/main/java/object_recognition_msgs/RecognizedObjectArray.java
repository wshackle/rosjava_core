package object_recognition_msgs;

public interface RecognizedObjectArray {
  static final java.lang.String _TYPE = "object_recognition_msgs/RecognizedObjectArray";
  static final java.lang.String _DEFINITION = ""
      + "##################################################### HEADER ###########################################################\n"
      + "Header header\n"
      + "# This message type describes a potential scene configuration: a set of objects that can explain the scene\n"
      + "object_recognition_msgs/RecognizedObject[] objects\n"
      + "##################################################### SEARCH ###########################################################\n"
      + "# The co-occurrence matrix between the recognized objects\n"
      + "float32[] cooccurrence\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<object_recognition_msgs.RecognizedObject> getObjects();
  void setObjects(java.util.List<object_recognition_msgs.RecognizedObject> value);
  float[] getCooccurrence();
  void setCooccurrence(float[] value);
}
