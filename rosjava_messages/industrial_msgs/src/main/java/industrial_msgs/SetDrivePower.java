package industrial_msgs;

public interface SetDrivePower extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/SetDrivePower";
  static final java.lang.String _DEFINITION = "# Direct method of turning drive power on and off\n# NOTE: Motion commands will automatically to this if\n# drive power is not on and a motion command is received.\n\nbool drive_power\n---\nindustrial_msgs/ServiceReturnCode code\n";
}
