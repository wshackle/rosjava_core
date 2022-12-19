rosjava is a set of tools and libraries needed for Java to communicate with ROS programs that would otherwise be restricted to C++ and Python.
(See [ROS.org](http://www.ros.org/) for more info on ROS.)  

This is a fork of [rosjava_core](https://github.com/rosjava/rosjava_core).

It differs in the following ways:

    * it uses maven as its build system rather than bazel and gradle.
    * it combines multiple dependancies so that the whole thing can be checkedout with one command and compiled with one command.
    * it adds the dependencies to the message_generation jar file so that source code can be generated without setting up a long classpath.


Javadoc documentaion built from this fork is available at https://wshackle.github.io/rosjava/apidocs/index.html

The instructions and javadoc copied from  the original source is at https://wshackle.github.io/orig_rosjava/0.1.6/

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

    java -jar [PATH_TO_TARGET]rosjava.message_generation-[MESSAGE_GENERATION_VERSION]-jar-with-dependencies.jar [OUTPUT_DIRECTORY] [ROS_PACKAGE]

for example

    java -jar rosjava_core/message_generation/target/rosjava.message_generation-1.0-SNAPSHOT-jar-with-dependencies.jar  /tmp moveit_msgs

will generate the Java source files for the moveit_msgs package in /tmp/moveit_msgs.


The script make_messages_project.bash will generate the source and a pom.xml file with
dependancies obtained from rospack depends.

For example:

    ./make_messages_project.bash motoman_msgs


will generate projects in rosjava_messages/motoman_msgs/ and rosjava_messages/industrial_msgs/ since that is a dependency.
 
    

