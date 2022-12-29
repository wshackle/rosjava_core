package shape_msgs;

public interface SolidPrimitive {
  static final java.lang.String _TYPE = "shape_msgs/SolidPrimitive";
  static final java.lang.String _DEFINITION = ""
      + "# Define box, sphere, cylinder, cone \n"
      + "# All shapes are defined to have their bounding boxes centered around 0,0,0.\n"
      + "uint8 BOX=1\n"
      + "uint8 SPHERE=2\n"
      + "uint8 CYLINDER=3\n"
      + "uint8 CONE=4\n"
      + "# The type of the shape\n"
      + "uint8 type\n"
      + "# The dimensions of the shape\n"
      + "float64[] dimensions\n"
      + "# The meaning of the shape dimensions: each constant defines the index in the \'dimensions\' array\n"
      + "# For the BOX type, the X, Y, and Z dimensions are the length of the corresponding\n"
      + "# sides of the box.\n"
      + "uint8 BOX_X=0\n"
      + "uint8 BOX_Y=1\n"
      + "uint8 BOX_Z=2\n"
      + "# For the SPHERE type, only one component is used, and it gives the radius of\n"
      + "# the sphere.\n"
      + "uint8 SPHERE_RADIUS=0\n"
      + "# For the CYLINDER and CONE types, the center line is oriented along\n"
      + "# the Z axis.  Therefore the CYLINDER_HEIGHT (CONE_HEIGHT) component\n"
      + "# of dimensions gives the height of the cylinder (cone).  The\n"
      + "# CYLINDER_RADIUS (CONE_RADIUS) component of dimensions gives the\n"
      + "# radius of the base of the cylinder (cone).  Cone and cylinder\n"
      + "# primitives are defined to be circular. The tip of the cone is\n"
      + "# pointing up, along +Z axis.\n"
      + "uint8 CYLINDER_HEIGHT=0\n"
      + "uint8 CYLINDER_RADIUS=1\n"
      + "uint8 CONE_HEIGHT=0\n"
      + "uint8 CONE_RADIUS=1\n"
      + "";
  static final byte BOX = 1;
  static final byte SPHERE = 2;
  static final byte CYLINDER = 3;
  static final byte CONE = 4;
  static final byte BOX_X = 0;
  static final byte BOX_Y = 1;
  static final byte BOX_Z = 2;
  static final byte SPHERE_RADIUS = 0;
  static final byte CYLINDER_HEIGHT = 0;
  static final byte CYLINDER_RADIUS = 1;
  static final byte CONE_HEIGHT = 0;
  static final byte CONE_RADIUS = 1;
  byte getType();
  void setType(byte value);
  double[] getDimensions();
  void setDimensions(double[] value);
}
