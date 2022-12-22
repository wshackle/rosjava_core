package moveit_msgs;

public interface AllowedCollisionMatrix {
  static final java.lang.String _TYPE = "moveit_msgs/AllowedCollisionMatrix";
  static final java.lang.String _DEFINITION = ""
      + "# The list of entry names in the matrix\n"
      + "string[] entry_names\n"
      + "# The individual entries in the allowed collision matrix\n"
      + "# square, symmetric, with same order as entry_names\n"
      + "AllowedCollisionEntry[] entry_values\n"
      + "# In addition to the collision matrix itself, we also have \n"
      + "# the default entry value for each entry name.\n"
      + "# If the allowed collision flag is queried for a pair of names (n1, n2)\n"
      + "# that is not found in the collision matrix itself, the value of\n"
      + "# the collision flag is considered to be that of the entry (n1 or n2)\n"
      + "# specified in the list below. If both n1 and n2 are found in the list \n"
      + "# of defaults, the result is computed with an AND operation\n"
      + "string[] default_entry_names\n"
      + "bool[] default_entry_values\n"
      + "";
  java.util.List<java.lang.String> getEntryNames();
  void setEntryNames(java.util.List<java.lang.String> value);
  java.util.List<moveit_msgs.AllowedCollisionEntry> getEntryValues();
  void setEntryValues(java.util.List<moveit_msgs.AllowedCollisionEntry> value);
  java.util.List<java.lang.String> getDefaultEntryNames();
  void setDefaultEntryNames(java.util.List<java.lang.String> value);
  boolean[] getDefaultEntryValues();
  void setDefaultEntryValues(boolean[] value);
}
