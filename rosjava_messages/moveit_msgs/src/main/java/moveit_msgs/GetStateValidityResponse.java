package moveit_msgs;

public interface GetStateValidityResponse {
  static final java.lang.String _TYPE = "moveit_msgs/GetStateValidityResponse";
  static final java.lang.String _DEFINITION = ""
      + "bool valid\n"
      + "ContactInformation[] contacts\n"
      + "CostSource[] cost_sources\n"
      + "ConstraintEvalResult[] constraint_result\n"
      + "";
  boolean getValid();
  void setValid(boolean value);
  java.util.List<moveit_msgs.ContactInformation> getContacts();
  void setContacts(java.util.List<moveit_msgs.ContactInformation> value);
  java.util.List<moveit_msgs.CostSource> getCostSources();
  void setCostSources(java.util.List<moveit_msgs.CostSource> value);
  java.util.List<moveit_msgs.ConstraintEvalResult> getConstraintResult();
  void setConstraintResult(java.util.List<moveit_msgs.ConstraintEvalResult> value);
}
