package nav_msgs;

public interface GridCells {
  static final java.lang.String _TYPE = "nav_msgs/GridCells";
  static final java.lang.String _DEFINITION = ""
      + "#an array of cells in a 2D grid\n"
      + "Header header\n"
      + "float32 cell_width\n"
      + "float32 cell_height\n"
      + "geometry_msgs/Point[] cells\n"
      + "";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getCellWidth();
  void setCellWidth(float value);
  float getCellHeight();
  void setCellHeight(float value);
  java.util.List<geometry_msgs.Point> getCells();
  void setCells(java.util.List<geometry_msgs.Point> value);
}
