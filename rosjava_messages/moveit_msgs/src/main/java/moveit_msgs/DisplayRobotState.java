package moveit_msgs;

public interface DisplayRobotState {
  static final java.lang.String _TYPE = "moveit_msgs/DisplayRobotState";
  static final java.lang.String _DEFINITION = ""
      + "# The robot state to display\n"
      + "RobotState state\n"
      + "# Optionally, various links can be highlighted\n"
      + "ObjectColor[] highlight_links\n"
      + "";
  moveit_msgs.RobotState getState();
  void setState(moveit_msgs.RobotState value);
  java.util.List<moveit_msgs.ObjectColor> getHighlightLinks();
  void setHighlightLinks(java.util.List<moveit_msgs.ObjectColor> value);
}
