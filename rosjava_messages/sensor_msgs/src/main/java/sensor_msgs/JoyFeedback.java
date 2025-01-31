package sensor_msgs;

public interface JoyFeedback {
  static final java.lang.String _TYPE = "sensor_msgs/JoyFeedback";
  static final java.lang.String _DEFINITION = ""
      + "# Declare of the type of feedback\n"
      + "uint8 TYPE_LED    = 0\n"
      + "uint8 TYPE_RUMBLE = 1\n"
      + "uint8 TYPE_BUZZER = 2\n"
      + "uint8 type\n"
      + "# This will hold an id number for each type of each feedback.\n"
      + "# Example, the first led would be id=0, the second would be id=1\n"
      + "uint8 id\n"
      + "# Intensity of the feedback, from 0.0 to 1.0, inclusive.  If device is\n"
      + "# actually binary, driver should treat 0<=x<0.5 as off, 0.5<=x<=1 as on.\n"
      + "float32 intensity\n"
      + "";
  static final byte TYPE_LED = 0;
  static final byte TYPE_RUMBLE = 1;
  static final byte TYPE_BUZZER = 2;
  byte getType();
  void setType(byte value);
  byte getId();
  void setId(byte value);
  float getIntensity();
  void setIntensity(float value);
}
