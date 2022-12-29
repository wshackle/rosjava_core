package sensor_msgs;

public interface BatteryState {
  static final java.lang.String _TYPE = "sensor_msgs/BatteryState";
  static final java.lang.String _DEFINITION = ""
      + "# Constants are chosen to match the enums in the linux kernel\n"
      + "# defined in include/linux/power_supply.h as of version 3.7\n"
      + "# The one difference is for style reasons the constants are\n"
      + "# all uppercase not mixed case.\n"
      + "# Power supply status constants\n"
      + "uint8 POWER_SUPPLY_STATUS_UNKNOWN = 0\n"
      + "uint8 POWER_SUPPLY_STATUS_CHARGING = 1\n"
      + "uint8 POWER_SUPPLY_STATUS_DISCHARGING = 2\n"
      + "uint8 POWER_SUPPLY_STATUS_NOT_CHARGING = 3\n"
      + "uint8 POWER_SUPPLY_STATUS_FULL = 4\n"
      + "# Power supply health constants\n"
      + "uint8 POWER_SUPPLY_HEALTH_UNKNOWN = 0\n"
      + "uint8 POWER_SUPPLY_HEALTH_GOOD = 1\n"
      + "uint8 POWER_SUPPLY_HEALTH_OVERHEAT = 2\n"
      + "uint8 POWER_SUPPLY_HEALTH_DEAD = 3\n"
      + "uint8 POWER_SUPPLY_HEALTH_OVERVOLTAGE = 4\n"
      + "uint8 POWER_SUPPLY_HEALTH_UNSPEC_FAILURE = 5\n"
      + "uint8 POWER_SUPPLY_HEALTH_COLD = 6\n"
      + "uint8 POWER_SUPPLY_HEALTH_WATCHDOG_TIMER_EXPIRE = 7\n"
      + "uint8 POWER_SUPPLY_HEALTH_SAFETY_TIMER_EXPIRE = 8\n"
      + "# Power supply technology (chemistry) constants\n"
      + "uint8 POWER_SUPPLY_TECHNOLOGY_UNKNOWN = 0\n"
      + "uint8 POWER_SUPPLY_TECHNOLOGY_NIMH = 1\n"
      + "uint8 POWER_SUPPLY_TECHNOLOGY_LION = 2\n"
      + "uint8 POWER_SUPPLY_TECHNOLOGY_LIPO = 3\n"
      + "uint8 POWER_SUPPLY_TECHNOLOGY_LIFE = 4\n"
      + "uint8 POWER_SUPPLY_TECHNOLOGY_NICD = 5\n"
      + "uint8 POWER_SUPPLY_TECHNOLOGY_LIMN = 6\n"
      + "Header  header\n"
      + "float32 voltage          # Voltage in Volts (Mandatory)\n"
      + "float32 current          # Negative when discharging (A)  (If unmeasured NaN)\n"
      + "float32 charge           # Current charge in Ah  (If unmeasured NaN)\n"
      + "float32 capacity         # Capacity in Ah (last full capacity)  (If unmeasured NaN)\n"
      + "float32 design_capacity  # Capacity in Ah (design capacity)  (If unmeasured NaN)\n"
      + "float32 percentage       # Charge percentage on 0 to 1 range  (If unmeasured NaN)\n"
      + "uint8   power_supply_status     # The charging status as reported. Values defined above\n"
      + "uint8   power_supply_health     # The battery health metric. Values defined above\n"
      + "uint8   power_supply_technology # The battery chemistry. Values defined above\n"
      + "bool    present          # True if the battery is present\n"
      + "float32[] cell_voltage   # An array of individual cell voltages for each cell in the pack\n"
      + "                         # If individual voltages unknown but number of cells known set each to NaN\n"
      + "string location          # The location into which the battery is inserted. (slot number or plug)\n"
      + "string serial_number     # The best approximation of the battery serial number\n"
      + "";
  static final byte POWER_SUPPLY_STATUS_UNKNOWN = 0;
  static final byte POWER_SUPPLY_STATUS_CHARGING = 1;
  static final byte POWER_SUPPLY_STATUS_DISCHARGING = 2;
  static final byte POWER_SUPPLY_STATUS_NOT_CHARGING = 3;
  static final byte POWER_SUPPLY_STATUS_FULL = 4;
  static final byte POWER_SUPPLY_HEALTH_UNKNOWN = 0;
  static final byte POWER_SUPPLY_HEALTH_GOOD = 1;
  static final byte POWER_SUPPLY_HEALTH_OVERHEAT = 2;
  static final byte POWER_SUPPLY_HEALTH_DEAD = 3;
  static final byte POWER_SUPPLY_HEALTH_OVERVOLTAGE = 4;
  static final byte POWER_SUPPLY_HEALTH_UNSPEC_FAILURE = 5;
  static final byte POWER_SUPPLY_HEALTH_COLD = 6;
  static final byte POWER_SUPPLY_HEALTH_WATCHDOG_TIMER_EXPIRE = 7;
  static final byte POWER_SUPPLY_HEALTH_SAFETY_TIMER_EXPIRE = 8;
  static final byte POWER_SUPPLY_TECHNOLOGY_UNKNOWN = 0;
  static final byte POWER_SUPPLY_TECHNOLOGY_NIMH = 1;
  static final byte POWER_SUPPLY_TECHNOLOGY_LION = 2;
  static final byte POWER_SUPPLY_TECHNOLOGY_LIPO = 3;
  static final byte POWER_SUPPLY_TECHNOLOGY_LIFE = 4;
  static final byte POWER_SUPPLY_TECHNOLOGY_NICD = 5;
  static final byte POWER_SUPPLY_TECHNOLOGY_LIMN = 6;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getVoltage();
  void setVoltage(float value);
  float getCurrent();
  void setCurrent(float value);
  float getCharge();
  void setCharge(float value);
  float getCapacity();
  void setCapacity(float value);
  float getDesignCapacity();
  void setDesignCapacity(float value);
  float getPercentage();
  void setPercentage(float value);
  byte getPowerSupplyStatus();
  void setPowerSupplyStatus(byte value);
  byte getPowerSupplyHealth();
  void setPowerSupplyHealth(byte value);
  byte getPowerSupplyTechnology();
  void setPowerSupplyTechnology(byte value);
  boolean getPresent();
  void setPresent(boolean value);
  float[] getCellVoltage();
  void setCellVoltage(float[] value);
  java.lang.String getLocation();
  void setLocation(java.lang.String value);
  java.lang.String getSerialNumber();
  void setSerialNumber(java.lang.String value);
}
