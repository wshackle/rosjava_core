package industrial_msgs;

public interface GetRobotInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/GetRobotInfo";
  static final java.lang.String _DEFINITION = "# The Get Robot Info service returns vendor specific information about\n# the robot(s) connected by the driver\n\n---\nindustrial_msgs/DeviceInfo controller\nindustrial_msgs/DeviceInfo[] robots\nindustrial_msgs/ServiceReturnCode code\n";
}
