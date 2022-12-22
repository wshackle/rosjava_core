package std_msgs;

public interface MultiArrayDimension {
  static final java.lang.String _TYPE = "std_msgs/MultiArrayDimension";
  static final java.lang.String _DEFINITION = ""
      + "string label   # label of given dimension\n"
      + "uint32 size    # size of given dimension (in type units)\n"
      + "uint32 stride  # stride of given dimension\n"
      + "";
  java.lang.String getLabel();
  void setLabel(java.lang.String value);
  int getSize();
  void setSize(int value);
  int getStride();
  void setStride(int value);
}
