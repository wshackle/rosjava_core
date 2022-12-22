package std_msgs;

public interface Float32MultiArray {
  static final java.lang.String _TYPE = "std_msgs/Float32MultiArray";
  static final java.lang.String _DEFINITION = ""
      + "# Please look at the MultiArrayLayout message definition for\n"
      + "# documentation on all multiarrays.\n"
      + "MultiArrayLayout  layout        # specification of data layout\n"
      + "float32[]         data          # array of data\n"
      + "";
  std_msgs.MultiArrayLayout getLayout();
  void setLayout(std_msgs.MultiArrayLayout value);
  float[] getData();
  void setData(float[] value);
}
