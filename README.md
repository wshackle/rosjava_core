rosjava is a set of tools and libraries needed for Java to communicate with ROS programs that would otherwise be restricted to C++ and Python.
(See [ROS.org](http://www.ros.org/) for more info on ROS.)  

This is a fork of rosjava_core.

It differs in that it uses maven as its build system rather than bazel and gradle.
Additional changes may be coming.

To build on ubuntu

sudo apt-get install default-jdk maven

To install on other platforms install a JDK (Java SE Development Kit) from [Adoptium](https://adoptium.net/) or [Oracle](https://www.oracle.com/java/technologies/downloads/) and maven from [Apache](https://maven.apache.org/download.cgi?.)


Compile with maven with:

mvn install
