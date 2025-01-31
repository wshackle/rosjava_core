package moveit_msgs;

public interface ContactInformation {
  static final java.lang.String _TYPE = "moveit_msgs/ContactInformation";
  static final java.lang.String _DEFINITION = ""
      + "# Standard ROS header contains information \n"
      + "# about the frame in which this \n"
      + "# contact is specified\n"
      + "Header header\n"
      + "# Position of the contact point\n"
      + "geometry_msgs/Point position\n"
      + "# Normal corresponding to the contact point\n"
      + "geometry_msgs/Vector3 normal \n"
      + "# Depth of contact point\n"
      + "float64 depth\n"
      + "# Name of the first body that is in contact\n"
      + "# This could be a link or a namespace that represents a body\n"
      + "string contact_body_1\n"
      + "uint32 body_type_1\n"
      + "# Name of the second body that is in contact\n"
      + "# This could be a link or a namespace that represents a body\n"
      + "string contact_body_2\n"
      + "uint32 body_type_2\n"
      + "uint32 ROBOT_LINK=0\n"
      + "uint32 WORLD_OBJECT=1\n"
      + "uint32 ROBOT_ATTACHED=2\n"
      + "";
  static final int ROBOT_LINK = 0;
  static final int WORLD_OBJECT = 1;
  static final int ROBOT_ATTACHED = 2;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Point getPosition();
  void setPosition(geometry_msgs.Point value);
  geometry_msgs.Vector3 getNormal();
  void setNormal(geometry_msgs.Vector3 value);
  double getDepth();
  void setDepth(double value);
  java.lang.String getContactBody1();
  void setContactBody1(java.lang.String value);
  int getBodyType1();
  void setBodyType1(int value);
  java.lang.String getContactBody2();
  void setContactBody2(java.lang.String value);
  int getBodyType2();
  void setBodyType2(int value);
}
