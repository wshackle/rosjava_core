package industrial_msgs;

public interface RobotStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/RobotStatus";
  static final java.lang.String _DEFINITION = "# The RobotStatus message contains low level status information \n# that is specific to an industrial robot controller\n\n# The header frame ID is not used\nHeader header\n\n# The robot mode captures the operating mode of the robot.  When in\n# manual, remote motion is not possible.\nindustrial_msgs/RobotMode mode\n\n# Estop status: True if robot is e-stopped.  The drives are disabled\n# and motion is not possible.  The e-stop condition must be acknowledged\n# and cleared before any motion can begin.\nindustrial_msgs/TriState e_stopped\n\n# Drive power status: True if drives are powered.  Motion commands will \n# automatically enable the drives if required.  Drive power is not requred\n# for possible motion\nindustrial_msgs/TriState drives_powered\n\n# Motion enabled: True if robot motion is possible.\nindustrial_msgs/TriState motion_possible\n\n# Motion status: True if robot is in motion, otherwise false\nindustrial_msgs/TriState in_motion\n\n# Error status: True if there is an error condition on the robot. Motion may\n# or may not be affected (see motion_possible)\nindustrial_msgs/TriState in_error\n\n# Error code: Vendor specific error code (non zero indicates error)\nint32 error_code\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  industrial_msgs.RobotMode getMode();
  void setMode(industrial_msgs.RobotMode value);
  industrial_msgs.TriState getEStopped();
  void setEStopped(industrial_msgs.TriState value);
  industrial_msgs.TriState getDrivesPowered();
  void setDrivesPowered(industrial_msgs.TriState value);
  industrial_msgs.TriState getMotionPossible();
  void setMotionPossible(industrial_msgs.TriState value);
  industrial_msgs.TriState getInMotion();
  void setInMotion(industrial_msgs.TriState value);
  industrial_msgs.TriState getInError();
  void setInError(industrial_msgs.TriState value);
  int getErrorCode();
  void setErrorCode(int value);
}
