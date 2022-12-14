package motoman_msgs;

public interface WriteMRegisterRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/WriteMRegisterRequest";
  static final java.lang.String _DEFINITION = "\n# Write \'value\' to the M register at \'address\'.\n#\n# Addresses are plain, base-10 integers, as used and displayed by the controller\n# (on the teach pendant for instance).\n#\n# Only the following addresses can be written to:\n#\n#  - 0 to 559\n#\n# NOTE 1: do not add 1000000 to the address, MotoROS will do this when\n#         necessary.\n#\n# NOTE 2: many programming languages will parse literals starting with \'0\' as\n#         octal numbers. Do not add leading zeros to register addresses to avoid\n#         specifying the wrong register to write to.\n#\n# Refer also the Yaskawa Motoman documentation on IO addressing and\n# configuration.\n\nuint32 address\nuint16 value\n";
  int getAddress();
  void setAddress(int value);
  short getValue();
  void setValue(short value);
}
