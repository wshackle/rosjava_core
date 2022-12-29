package shape_msgs;

public interface MeshTriangle {
  static final java.lang.String _TYPE = "shape_msgs/MeshTriangle";
  static final java.lang.String _DEFINITION = ""
      + "# Definition of a triangle\'s vertices\n"
      + "uint32[3] vertex_indices\n"
      + "";
  int[] getVertexIndices();
  void setVertexIndices(int[] value);
}
