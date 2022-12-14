package motoman_msgs;

public interface WriteSingleIO extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/WriteSingleIO";
  static final java.lang.String _DEFINITION = "\n# Write \'value\' to the IO element at \'address\'.\n#\n# This service does not return anything.\n#\n# Addresses are plain, base-10 integers, as used and displayed by the controller\n# (on the teach pendant for instance).\n#\n# Only the following addresses can be written to:\n#\n#  - 27010 and up : Network Inputs (25010 and up on DX100 and FS100)\n#  - 10010 and up : Universal/General Outputs\n#\n# Refer also the Yaskawa Motoman documentation on IO addressing and\n# configuration.\n\nuint32 address\nint32 value\n---\nstring message\nbool success\n";
}
