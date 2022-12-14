package object_recognition_msgs;

public interface ObjectRecognitionActionResult extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "object_recognition_msgs/ObjectRecognitionActionResult";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalStatus status\nobject_recognition_msgs/ObjectRecognitionResult result";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  object_recognition_msgs.ObjectRecognitionResult getResult();
  void setResult(object_recognition_msgs.ObjectRecognitionResult value);
}
