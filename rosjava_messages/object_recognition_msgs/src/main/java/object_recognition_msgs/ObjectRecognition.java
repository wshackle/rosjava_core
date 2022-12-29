package object_recognition_msgs;

public interface ObjectRecognition {
  static final java.lang.String _TYPE = "object_recognition_msgs/ObjectRecognition";
  static final java.lang.String _DEFINITION = ""
      + "# Optional ROI to use for the object detection\n"
      + "bool use_roi\n"
      + "float32[] filter_limits\n"
      + "---\n"
      + "# Send the found objects, see the msg files for docs\n"
      + "object_recognition_msgs/RecognizedObjectArray recognized_objects\n"
      + "---\n"
      + "#no feedback\n"
      + "";
}
