package object_recognition_msgs;

public interface ObjectInformation {
  static final java.lang.String _TYPE = "object_recognition_msgs/ObjectInformation";
  static final java.lang.String _DEFINITION = ""
      + "############################################## VISUALIZATION INFO ######################################################\n"
      + "################### THIS INFO SHOULD BE OBTAINED INDEPENDENTLY FROM THE CORE, LIKE IN AN RVIZ PLUGIN ###################\n"
      + "# The human readable name of the object\n"
      + "string name\n"
      + "# The full mesh of the object: this can be useful for display purposes, augmented reality ... but it can be big\n"
      + "# Make sure the type is MESH\n"
      + "shape_msgs/Mesh ground_truth_mesh\n"
      + "# Sometimes, you only have a cloud in the DB\n"
      + "# Make sure the type is POINTS\n"
      + "sensor_msgs/PointCloud2 ground_truth_point_cloud\n"
      + "";
  java.lang.String getName();
  void setName(java.lang.String value);
  shape_msgs.Mesh getGroundTruthMesh();
  void setGroundTruthMesh(shape_msgs.Mesh value);
  sensor_msgs.PointCloud2 getGroundTruthPointCloud();
  void setGroundTruthPointCloud(sensor_msgs.PointCloud2 value);
}
