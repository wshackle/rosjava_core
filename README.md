rosjava is a set of tools and libraries needed for Java to communicate with ROS programs that would otherwise be restricted to C++ and Python.
(See [ROS.org](http://www.ros.org/) for more info on ROS.)  

This is a fork of rosjava_core.

It differs in that it uses maven as its build system rather than bazel and gradle.
Additional changes may be coming.

Javadoc documentaion is available at https://wshackle.github.io/rosjava/apidocs/index.html


To build on ubuntu

sudo apt-get install default-jdk maven

To install on other platforms install a JDK (Java SE Development Kit) from [Adoptium](https://adoptium.net/) or [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/) and maven from [Apache](https://maven.apache.org/download.cgi?.)


Compile with maven with:

mvn install


To generate java sources for a ROS package.

Set the ROS_PACKAGE_PATH environment variable by sourcing the setup.bash of either the
main distribution or a catkin workspace where the package was installed.

For example:


    source /opt/ros/melodic/setup.bash

or

    cd ~/ws_moveit
    source devel/setup.bash

then run the message_generation jar file with 

    java -jar [PATH_TO_TARGET]rosjava.message_generation-[MESSAGE_GENERATION_VERSION]-with-dependencies.jar [OUTPUT_DIRECTORY] [ROS_PACKAGE]

for example

    java -jar rosjava_core/message_generation/target/rosjava.message_generation-1.0-SNAPSHOT-jar-with-dependencies.jar  /tmp moveit_msgs

will generate the Java source files for the moveit_msgs package in /tmp/moveit_msgs.


    

