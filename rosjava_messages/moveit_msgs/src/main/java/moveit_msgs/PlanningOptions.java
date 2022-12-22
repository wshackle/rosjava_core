package moveit_msgs;

public interface PlanningOptions {
  static final java.lang.String _TYPE = "moveit_msgs/PlanningOptions";
  static final java.lang.String _DEFINITION = ""
      + "# The diff to consider for the planning scene (optional)\n"
      + "PlanningScene planning_scene_diff\n"
      + "# If this flag is set to true, the action\n"
      + "# returns an executable plan in the response but does not attempt execution  \n"
      + "bool plan_only\n"
      + "# If this flag is set to true, the action of planning &\n"
      + "# executing is allowed to look around  (move sensors) if\n"
      + "# it seems that not enough information is available about\n"
      + "# the environment\n"
      + "bool look_around\n"
      + "# If this value is positive, the action of planning & executing\n"
      + "# is allowed to look around for a maximum number of attempts;\n"
      + "# If the value is left as 0, the default value is used, as set\n"
      + "# with dynamic_reconfigure\n"
      + "int32 look_around_attempts\n"
      + "# If set and if look_around is true, this value is used as\n"
      + "# the maximum cost allowed for a path to be considered executable.\n"
      + "# If the cost of a path is higher than this value, more sensing or \n"
      + "# a new plan needed. If left as 0.0 but look_around is true, then \n"
      + "# the default value set via dynamic_reconfigure is used\n"
      + "float64 max_safe_execution_cost\n"
      + "# If the plan becomes invalidated during execution, it is possible to have\n"
      + "# that plan recomputed and execution restarted. This flag enables this\n"
      + "# functionality \n"
      + "bool replan\n"
      + "# The maximum number of replanning attempts \n"
      + "int32 replan_attempts\n"
      + "# The amount of time to wait in between replanning attempts (in seconds)\n"
      + "float64 replan_delay\n"
      + "";
  moveit_msgs.PlanningScene getPlanningSceneDiff();
  void setPlanningSceneDiff(moveit_msgs.PlanningScene value);
  boolean getPlanOnly();
  void setPlanOnly(boolean value);
  boolean getLookAround();
  void setLookAround(boolean value);
  int getLookAroundAttempts();
  void setLookAroundAttempts(int value);
  double getMaxSafeExecutionCost();
  void setMaxSafeExecutionCost(double value);
  boolean getReplan();
  void setReplan(boolean value);
  int getReplanAttempts();
  void setReplanAttempts(int value);
  double getReplanDelay();
  void setReplanDelay(double value);
}
