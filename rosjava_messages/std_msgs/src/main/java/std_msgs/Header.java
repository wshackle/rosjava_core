package std_msgs;

public interface Header {
  static final java.lang.String _TYPE = "std_msgs/Header";
  static final java.lang.String _DEFINITION = ""
      + "# Standard metadata for higher-level stamped data types.\n"
      + "# This is generally used to communicate timestamped data \n"
      + "# in a particular coordinate frame.\n"
      + "# \n"
      + "# sequence ID: consecutively increasing ID \n"
      + "uint32 seq\n"
      + "#Two-integer timestamp that is expressed as:\n"
      + "# * stamp.sec: seconds (stamp_secs) since epoch (in Python the variable is called \'secs\')\n"
      + "# * stamp.nsec: nanoseconds since stamp_secs (in Python the variable is called \'nsecs\')\n"
      + "# time-handling sugar is provided by the client library\n"
      + "time stamp\n"
      + "#Frame this data is associated with\n"
      + "string frame_id\n"
      + "";
  int getSeq();
  void setSeq(int value);
  org.ros.message.Time getStamp();
  void setStamp(org.ros.message.Time value);
  java.lang.String getFrameId();
  void setFrameId(java.lang.String value);
}
