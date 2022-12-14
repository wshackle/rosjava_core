package motoman_msgs;

public interface WriteGroupIORequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/WriteGroupIORequest";
  static final java.lang.String _DEFINITION = "\n# Write \'value\' to the Group IO element at \'address\'.\n#\n# Addresses are plain, base-10 integers, as used and displayed by the controller\n# (on the teach pendant for instance).\n#\n# Only the following addresses can be written to:\n#\n#  - 2701 and up : Network Inputs (2501 and up on DX100 and FS100)\n#  - 1001 and up : Universal/General Outputs\n#\n# NOTE: many programming languages will parse literals starting with \'0\' as\n#       octal numbers. Do not add leading zeros to group addresses to avoid\n#       specifying the wrong address to write to.\n\n# Refer also the Yaskawa Motoman documentation on IO addressing and\n# configuration.\n\nuint32 address\nuint8 value\n";
  int getAddress();
  void setAddress(int value);
  byte getValue();
  void setValue(byte value);
}
