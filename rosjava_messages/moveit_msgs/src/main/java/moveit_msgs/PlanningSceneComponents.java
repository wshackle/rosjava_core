package moveit_msgs;

public interface PlanningSceneComponents {
  static final java.lang.String _TYPE = "moveit_msgs/PlanningSceneComponents";
  static final java.lang.String _DEFINITION = ""
      + "# This message defines the components that make up the PlanningScene message.\n"
      + "# The values can be used as a bitfield to specify which parts of the PlanningScene message\n"
      + "# are of interest\n"
      + "# Scene name, model name, model root\n"
      + "uint32 SCENE_SETTINGS=1\n"
      + "# Joint values of the robot state\n"
      + "uint32 ROBOT_STATE=2\n"
      + "# Attached objects (including geometry) for the robot state\n"
      + "uint32 ROBOT_STATE_ATTACHED_OBJECTS=4\n"
      + "# The names of the world objects\n"
      + "uint32 WORLD_OBJECT_NAMES=8\n"
      + "# The geometry of the world objects\n"
      + "uint32 WORLD_OBJECT_GEOMETRY=16\n"
      + "# The maintained octomap \n"
      + "uint32 OCTOMAP=32\n"
      + "# The maintained list of transforms\n"
      + "uint32 TRANSFORMS=64\n"
      + "# The allowed collision matrix\n"
      + "uint32 ALLOWED_COLLISION_MATRIX=128\n"
      + "# The default link padding and link scaling\n"
      + "uint32 LINK_PADDING_AND_SCALING=256\n"
      + "# The stored object colors\n"
      + "uint32 OBJECT_COLORS=512\n"
      + "# Bitfield combining options indicated above\n"
      + "uint32 components\n"
      + "";
  static final int SCENE_SETTINGS = 1;
  static final int ROBOT_STATE = 2;
  static final int ROBOT_STATE_ATTACHED_OBJECTS = 4;
  static final int WORLD_OBJECT_NAMES = 8;
  static final int WORLD_OBJECT_GEOMETRY = 16;
  static final int OCTOMAP = 32;
  static final int TRANSFORMS = 64;
  static final int ALLOWED_COLLISION_MATRIX = 128;
  static final int LINK_PADDING_AND_SCALING = 256;
  static final int OBJECT_COLORS = 512;
  int getComponents();
  void setComponents(int value);
}
