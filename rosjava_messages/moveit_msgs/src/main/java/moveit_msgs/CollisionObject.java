package moveit_msgs;

public interface CollisionObject {
  static final java.lang.String _TYPE = "moveit_msgs/CollisionObject";
  static final java.lang.String _DEFINITION = ""
      + "# A header, used for interpreting the poses\n"
      + "Header header\n"
      + "# The id of the object (name used in MoveIt)\n"
      + "string id\n"
      + "# The object type in a database of known objects\n"
      + "object_recognition_msgs/ObjectType type\n"
      + "# The collision geometries associated with the object.\n"
      + "# Their poses are with respect to the specified header\n"
      + "# Solid geometric primitives\n"
      + "shape_msgs/SolidPrimitive[] primitives\n"
      + "geometry_msgs/Pose[] primitive_poses\n"
      + "# Meshes\n"
      + "shape_msgs/Mesh[] meshes\n"
      + "geometry_msgs/Pose[] mesh_poses\n"
      + "# Bounding planes (equation is specified, but the plane can be oriented using an additional pose)\n"
      + "shape_msgs/Plane[] planes\n"
      + "geometry_msgs/Pose[] plane_poses\n"
      + "# Adds the object to the planning scene. If the object previously existed, it is replaced.\n"
      + "byte ADD=0\n"
      + "# Removes the object from the environment entirely (everything that matches the specified id)\n"
      + "byte REMOVE=1\n"
      + "# Append to an object that already exists in the planning scene. If the object does not exist, it is added.\n"
      + "byte APPEND=2\n"
      + "# If an object already exists in the scene, new poses can be sent (the geometry arrays must be left empty)\n"
      + "# if solely moving the object is desired\n"
      + "byte MOVE=3\n"
      + "# Operation to be performed\n"
      + "byte operation\n"
      + "";
  static final byte ADD = 0;
  static final byte REMOVE = 1;
  static final byte APPEND = 2;
  static final byte MOVE = 3;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getId();
  void setId(java.lang.String value);
  object_recognition_msgs.ObjectType getType();
  void setType(object_recognition_msgs.ObjectType value);
  java.util.List<shape_msgs.SolidPrimitive> getPrimitives();
  void setPrimitives(java.util.List<shape_msgs.SolidPrimitive> value);
  java.util.List<geometry_msgs.Pose> getPrimitivePoses();
  void setPrimitivePoses(java.util.List<geometry_msgs.Pose> value);
  java.util.List<shape_msgs.Mesh> getMeshes();
  void setMeshes(java.util.List<shape_msgs.Mesh> value);
  java.util.List<geometry_msgs.Pose> getMeshPoses();
  void setMeshPoses(java.util.List<geometry_msgs.Pose> value);
  java.util.List<shape_msgs.Plane> getPlanes();
  void setPlanes(java.util.List<shape_msgs.Plane> value);
  java.util.List<geometry_msgs.Pose> getPlanePoses();
  void setPlanePoses(java.util.List<geometry_msgs.Pose> value);
  byte getOperation();
  void setOperation(byte value);
}
