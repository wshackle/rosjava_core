package motoman_msgs;

public interface DynamicJointState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/DynamicJointState";
  static final java.lang.String _DEFINITION = "#group[]: # length of this array must match num_groups\n#    id:   control-group ID for use on-controller\n#    num_joints: # of joints in this motion group\n#    valid_fields: #bit field for following items\n#    # length of the following items must match num_joints, order set by controller.  Invalid fields (see bit field above) are not included, resulting in a shorter message.\n#    positions[]\n#    velocities[]\n#    accelerations[]\n#    effort[]\n#    position_desired[]\n#    position_errors[]\n#    velocity_desired[]\n#    velocity_errors[]\n#    effort_desired[]\n#    effort_error[]\n\nint16 group_number\nint16 num_joints\nint16 valid_fields\nfloat64[] positions\nfloat64[] velocities\nfloat64[] accelerations\nfloat64[] effort\nfloat64[] positions_desired\nfloat64[] positions_errors\nfloat64[] velocities_desired\nfloat64[] velocities_errors\nfloat64[] accelerations_desired\nfloat64[] accelerations_errors\nfloat64[] effort_errors\nfloat64[] effort_desired\n";
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
  double[] getPositionsDesired();
  void setPositionsDesired(double[] value);
  double[] getPositionsErrors();
  void setPositionsErrors(double[] value);
  double[] getVelocitiesDesired();
  void setVelocitiesDesired(double[] value);
  double[] getVelocitiesErrors();
  void setVelocitiesErrors(double[] value);
  double[] getAccelerationsDesired();
  void setAccelerationsDesired(double[] value);
  double[] getAccelerationsErrors();
  void setAccelerationsErrors(double[] value);
  double[] getEffortErrors();
  void setEffortErrors(double[] value);
  double[] getEffortDesired();
  void setEffortDesired(double[] value);
}
