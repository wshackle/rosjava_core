package moveit_msgs;

public interface MoveItErrorCodes {
  static final java.lang.String _TYPE = "moveit_msgs/MoveItErrorCodes";
  static final java.lang.String _DEFINITION = ""
      + "int32 val\n"
      + "# overall behavior\n"
      + "int32 SUCCESS=1\n"
      + "int32 FAILURE=99999\n"
      + "int32 PLANNING_FAILED=-1\n"
      + "int32 INVALID_MOTION_PLAN=-2\n"
      + "int32 MOTION_PLAN_INVALIDATED_BY_ENVIRONMENT_CHANGE=-3\n"
      + "int32 CONTROL_FAILED=-4\n"
      + "int32 UNABLE_TO_AQUIRE_SENSOR_DATA=-5\n"
      + "int32 TIMED_OUT=-6\n"
      + "int32 PREEMPTED=-7\n"
      + "# planning & kinematics request errors\n"
      + "int32 START_STATE_IN_COLLISION=-10\n"
      + "int32 START_STATE_VIOLATES_PATH_CONSTRAINTS=-11\n"
      + "int32 GOAL_IN_COLLISION=-12\n"
      + "int32 GOAL_VIOLATES_PATH_CONSTRAINTS=-13\n"
      + "int32 GOAL_CONSTRAINTS_VIOLATED=-14\n"
      + "int32 INVALID_GROUP_NAME=-15\n"
      + "int32 INVALID_GOAL_CONSTRAINTS=-16\n"
      + "int32 INVALID_ROBOT_STATE=-17\n"
      + "int32 INVALID_LINK_NAME=-18\n"
      + "int32 INVALID_OBJECT_NAME=-19\n"
      + "# system errors\n"
      + "int32 FRAME_TRANSFORM_FAILURE=-21\n"
      + "int32 COLLISION_CHECKING_UNAVAILABLE=-22\n"
      + "int32 ROBOT_STATE_STALE=-23\n"
      + "int32 SENSOR_INFO_STALE=-24\n"
      + "# kinematics errors\n"
      + "int32 NO_IK_SOLUTION=-31\n"
      + "";
  static final int SUCCESS = 1;
  static final int FAILURE = 99999;
  static final int PLANNING_FAILED = -1;
  static final int INVALID_MOTION_PLAN = -2;
  static final int MOTION_PLAN_INVALIDATED_BY_ENVIRONMENT_CHANGE = -3;
  static final int CONTROL_FAILED = -4;
  static final int UNABLE_TO_AQUIRE_SENSOR_DATA = -5;
  static final int TIMED_OUT = -6;
  static final int PREEMPTED = -7;
  static final int START_STATE_IN_COLLISION = -10;
  static final int START_STATE_VIOLATES_PATH_CONSTRAINTS = -11;
  static final int GOAL_IN_COLLISION = -12;
  static final int GOAL_VIOLATES_PATH_CONSTRAINTS = -13;
  static final int GOAL_CONSTRAINTS_VIOLATED = -14;
  static final int INVALID_GROUP_NAME = -15;
  static final int INVALID_GOAL_CONSTRAINTS = -16;
  static final int INVALID_ROBOT_STATE = -17;
  static final int INVALID_LINK_NAME = -18;
  static final int INVALID_OBJECT_NAME = -19;
  static final int FRAME_TRANSFORM_FAILURE = -21;
  static final int COLLISION_CHECKING_UNAVAILABLE = -22;
  static final int ROBOT_STATE_STALE = -23;
  static final int SENSOR_INFO_STALE = -24;
  static final int NO_IK_SOLUTION = -31;
  int getVal();
  void setVal(int value);
}
