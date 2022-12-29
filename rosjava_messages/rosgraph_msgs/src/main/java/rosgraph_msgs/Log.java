package rosgraph_msgs;

public interface Log {
  static final java.lang.String _TYPE = "rosgraph_msgs/Log";
  static final java.lang.String _DEFINITION = ""
      + "##\n"
      + "## Severity level constants\n"
      + "##\n"
      + "byte DEBUG=1 #debug level\n"
      + "byte INFO=2  #general level\n"
      + "byte WARN=4  #warning level\n"
      + "byte ERROR=8 #error level\n"
      + "byte FATAL=16 #fatal/critical level\n"
      + "##\n"
      + "## Fields\n"
      + "##\n"
      + "Header header\n"
      + "byte level\n"
      + "string name # name of the node\n"
      + "string msg # message \n"
      + "string file # file the message came from\n"
      + "string function # function the message came from\n"
      + "uint32 line # line the message came from\n"
      + "string[] topics # topic names that the node publishes\n"
      + "";
  static final byte DEBUG = 1;
  static final byte INFO = 2;
  static final byte WARN = 4;
  static final byte ERROR = 8;
  static final byte FATAL = 16;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  byte getLevel();
  void setLevel(byte value);
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
  java.lang.String getFile();
  void setFile(java.lang.String value);
  java.lang.String getFunction();
  void setFunction(java.lang.String value);
  int getLine();
  void setLine(int value);
  java.util.List<java.lang.String> getTopics();
  void setTopics(java.util.List<java.lang.String> value);
}
