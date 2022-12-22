package moveit_msgs;

public interface AllowedCollisionEntry {
  static final java.lang.String _TYPE = "moveit_msgs/AllowedCollisionEntry";
  static final java.lang.String _DEFINITION = ""
      + "# whether or not collision checking is enabled\n"
      + "bool[] enabled\n"
      + "";
  boolean[] getEnabled();
  void setEnabled(boolean[] value);
}
