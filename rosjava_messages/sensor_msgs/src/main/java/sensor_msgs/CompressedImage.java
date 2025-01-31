package sensor_msgs;

public interface CompressedImage {
  static final java.lang.String _TYPE = "sensor_msgs/CompressedImage";
  static final java.lang.String _DEFINITION = ""
      + "# This message contains a compressed image\n"
      + "Header header        # Header timestamp should be acquisition time of image\n"
      + "                     # Header frame_id should be optical frame of camera\n"
      + "                     # origin of frame should be optical center of camera\n"
      + "                     # +x should point to the right in the image\n"
      + "                     # +y should point down in the image\n"
      + "                     # +z should point into to plane of the image\n"
      + "string format        # Specifies the format of the data\n"
      + "                     #   Acceptable values:\n"
      + "                     #     jpeg, png\n"
      + "uint8[] data         # Compressed image buffer\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getFormat();
  void setFormat(java.lang.String value);
  org.jboss.netty.buffer.ChannelBuffer getData();
  void setData(org.jboss.netty.buffer.ChannelBuffer value);
}
