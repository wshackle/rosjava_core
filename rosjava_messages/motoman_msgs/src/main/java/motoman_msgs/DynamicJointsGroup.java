package motoman_msgs;

public interface DynamicJointsGroup extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/DynamicJointsGroup";
  static final java.lang.String _DEFINITION = "# DynamicJointsGroup\n#group: # length of this array must match num_groups\n#    id:   control-group ID for use on-controller\n#    num_joints: # of joints in this motion group\n#    valid_fields: #bit field for following items\n#    # length of the following items must match num_joints, order set by controller.  Invalid fields (see bit field above) are not included, resulting in a shorter message.\n#    positions[]\n#    velocities[]\n#    accelerations[]\n#    effort[]\n#    time_from_start\n\n\nint16 group_number\nint16 num_joints\nint16 valid_fields\nfloat64[] positions\nfloat64[] velocities\nfloat64[] accelerations\nfloat64[] effort\nduration time_from_start\n";
  short getGroupNumber();
  void setGroupNumber(short value);
  short getNumJoints();
  void setNumJoints(short value);
  short getValidFields();
  void setValidFields(short value);
  double[] getPositions();
  void setPositions(double[] value);
  double[] getVelocities();
  void setVelocities(double[] value);
  double[] getAccelerations();
  void setAccelerations(double[] value);
  double[] getEffort();
  void setEffort(double[] value);
  org.ros.message.Duration getTimeFromStart();
  void setTimeFromStart(org.ros.message.Duration value);
}
