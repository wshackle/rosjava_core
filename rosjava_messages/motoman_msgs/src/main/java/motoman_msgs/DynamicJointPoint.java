package motoman_msgs;

public interface DynamicJointPoint extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "motoman_msgs/DynamicJointPoint";
  static final java.lang.String _DEFINITION = "# DynamicJointPoint\n#group: # length of this array must match num_groups\n#    id:   control-group ID for use on-controller\n#    num_joints: # of joints in this motion group\n#    valid_fields: #bit field for following items\n#    # length of the following items must match num_joints, order set by controller.  Invalid fields (see bit field above) are not included, resulting in a shorter message.\n#    positions[]\n#    velocities[]\n#    accelerations[]\n#    effort[]\n#    time_from_start\n\nint16 num_groups\nDynamicJointsGroup[] groups\n";
  short getNumGroups();
  void setNumGroups(short value);
  java.util.List<motoman_msgs.DynamicJointsGroup> getGroups();
  void setGroups(java.util.List<motoman_msgs.DynamicJointsGroup> value);
}
