package moveit_msgs;

public interface LinkScale {
  static final java.lang.String _TYPE = "moveit_msgs/LinkScale";
  static final java.lang.String _DEFINITION = ""
      + "#name for the link\n"
      + "string link_name\n"
      + "# scaling to apply to the link\n"
      + "float64 scale\n"
      + "";
  java.lang.String getLinkName();
  void setLinkName(java.lang.String value);
  double getScale();
  void setScale(double value);
}
