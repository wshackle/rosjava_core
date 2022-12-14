package industrial_msgs;

public interface DeviceInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "industrial_msgs/DeviceInfo";
  static final java.lang.String _DEFINITION = "# Device info captures device agnostic information about a piece of hardware.\n# This message is meant as a generic as possible.  Items that don\'t apply should\n# be left blank.  This message is not meant to replace diagnostic messages, but\n# rather provide a standard service message that can be used to populate standard\n# components (like a GUI for example)\n\nstring model\nstring serial_number\nstring hw_version\nstring sw_version\nstring address\n";
  java.lang.String getModel();
  void setModel(java.lang.String value);
  java.lang.String getSerialNumber();
  void setSerialNumber(java.lang.String value);
  java.lang.String getHwVersion();
  void setHwVersion(java.lang.String value);
  java.lang.String getSwVersion();
  void setSwVersion(java.lang.String value);
  java.lang.String getAddress();
  void setAddress(java.lang.String value);
}
