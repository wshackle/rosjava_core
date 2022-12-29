package actionlib_msgs;

public interface GoalStatusArray {
  static final java.lang.String _TYPE = "actionlib_msgs/GoalStatusArray";
  static final java.lang.String _DEFINITION = ""
      + "# Stores the statuses for goals that are currently being tracked\n"
      + "# by an action server\n"
      + "Header header\n"
      + "GoalStatus[] status_list\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<actionlib_msgs.GoalStatus> getStatusList();
  void setStatusList(java.util.List<actionlib_msgs.GoalStatus> value);
}
