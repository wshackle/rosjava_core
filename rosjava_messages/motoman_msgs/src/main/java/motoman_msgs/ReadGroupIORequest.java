package motoman_msgs;

public interface ReadGroupIORequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/ReadGroupIORequest";
  static final java.lang.String _DEFINITION = "\n# Read (and return) the current value of the Group IO element at \'address\'.\n#\n# Addresses are plain, base-10 integers, as used and displayed by the controller\n# (on the teach pendant for instance).\n#\n# There are no restrictions as to which group IO elements can be read, but they\n# have to exist on the controller and be configured correctly.\n#\n# NOTE: many programming languages will parse literals starting with \'0\' as\n#       octal numbers. Do not add leading zeros to group addresses to avoid\n#       specifying the wrong address to read.\n#\n# Refer also the Yaskawa Motoman documentation on IO addressing and\n# configuration.\n\nuint32 address\n";
  int getAddress();
  void setAddress(int value);
}
