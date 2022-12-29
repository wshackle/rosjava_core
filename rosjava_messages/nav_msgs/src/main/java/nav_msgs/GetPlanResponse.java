package nav_msgs;

public interface GetPlanResponse {
  static final java.lang.String _TYPE = "nav_msgs/GetPlanResponse";
  static final java.lang.String _DEFINITION = ""
      + "nav_msgs/Path plan\n"
      + "";
  nav_msgs.Path getPlan();
  void setPlan(nav_msgs.Path value);
}
