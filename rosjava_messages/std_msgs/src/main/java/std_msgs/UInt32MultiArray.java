package std_msgs;

public interface UInt32MultiArray {
  static final java.lang.String _TYPE = "std_msgs/UInt32MultiArray";
  static final java.lang.String _DEFINITION = ""
      + "# Please look at the MultiArrayLayout message definition for\n"
      + "# documentation on all multiarrays.\n"
      + "MultiArrayLayout  layout        # specification of data layout\n"
      + "uint32[]          data          # array of data\n"
      + "";
  std_msgs.MultiArrayLayout getLayout();
  void setLayout(std_msgs.MultiArrayLayout value);
  int[] getData();
  void setData(int[] value);
}
