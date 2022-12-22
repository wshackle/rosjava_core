package moveit_msgs;

public interface LinkPadding {
  static final java.lang.String _TYPE = "moveit_msgs/LinkPadding";
  static final java.lang.String _DEFINITION = ""
      + "#name for the link\n"
      + "string link_name\n"
      + "# padding to apply to the link\n"
      + "float64 padding\n"
      + "";
  java.lang.String getLinkName();
  void setLinkName(java.lang.String value);
  double getPadding();
  void setPadding(double value);
}
