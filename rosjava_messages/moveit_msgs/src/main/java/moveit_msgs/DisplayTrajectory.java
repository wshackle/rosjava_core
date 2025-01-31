package moveit_msgs;

public interface DisplayTrajectory {
  static final java.lang.String _TYPE = "moveit_msgs/DisplayTrajectory";
  static final java.lang.String _DEFINITION = ""
      + "# The model id for which this path has been generated\n"
      + "string model_id\n"
      + "# The representation of the path contains position values for all the joints that are moving along the path; a sequence of trajectories may be specified\n"
      + "RobotTrajectory[] trajectory\n"
      + "# The robot state is used to obtain positions for all/some of the joints of the robot. \n"
      + "# It is used by the path display node to determine the positions of the joints that are not specified in the joint path message above. \n"
      + "# If the robot state message contains joint position information for joints that are also mentioned in the joint path message, the positions in the joint path message will overwrite the positions specified in the robot state message. \n"
      + "RobotState trajectory_start\n"
      + "";
  java.lang.String getModelId();
  void setModelId(java.lang.String value);
  java.util.List<moveit_msgs.RobotTrajectory> getTrajectory();
  void setTrajectory(java.util.List<moveit_msgs.RobotTrajectory> value);
  moveit_msgs.RobotState getTrajectoryStart();
  void setTrajectoryStart(moveit_msgs.RobotState value);
}
