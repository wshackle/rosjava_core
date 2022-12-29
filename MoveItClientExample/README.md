This provides an example of controlling a robot through ROS 1 / MoveIt 1.
 
It is compatible with the simulated puma robot in the MoveIt tutorial for the ROS 1 Melodic / MoveIt 1 at
                http://docs.ros.org/en/melodic/api/moveit_tutorials/html/index.html

Install a JDK and maven.

    On Ubuntu:

        sudo apt-get install default-jdk maven

    To install on other platforms install a JDK (Java SE Development Kit) from [Adoptium](https://adoptium.net/) or [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/) and maven from [Apache](https://maven.apache.org/download.cgi?.)


    Compile with maven first compile in the top-level parent directory and then this directory both with:

        mvn install


Before running one needs to setup ROS Melodic and MoveIt and to start the simulated puma robot and moveit as described in the tutorial link above.

The java program can be run with:

        mvn exec:exec

Or build a fat jar file with all dependencies so you can run with just java without the need for maven to 
compute the long classpath.

        mvn package -Puse_locally_installed_rosjava_artifacts -Pjar-with-depend

With the "jar-with-dependencies" built, you can run with:

        java -jar target/MoveItClientExample-1.0-SNAPSHOT-jar-with-dependencies.jar

# after NISTIR1 tag




        

The java program will display the current joint positions and pose and can send a Pose or joint goal to MoveIt to move the simulated robot that can be seen in RViz.
