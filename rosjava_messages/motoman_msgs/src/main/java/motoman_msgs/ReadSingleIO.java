package motoman_msgs;

public interface ReadSingleIO extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/ReadSingleIO";
  static final java.lang.String _DEFINITION = "\n# Read (and return) the current value of the IO element at \'address\'.\n#\n# Addresses are plain, base-10 integers, as used and displayed by the controller\n# (on the teach pendant for instance).\n#\n# There are no restrictions as to which IO elements can be read, but they have\n# to exist on the controller and be configured correctly.\n#\n# Refer also the Yaskawa Motoman documentation on IO addressing and\n# configuration.\n\nuint32 address\n---\nstring message\nbool success\nint32 value\n";
}
