#!/bin/bash

set -x

mkdir -p rosjava_messages/$1/src/main/java

java -jar `find . -name rosjava.message_generation-\*-jar-with-dependencies.jar`  rosjava_messages/$1/src/main/java  $1

ls rosjava_messages/$1/src/main/java
ls rosjava_messages/$1/src/main/java/$1

cat > rosjava_messages/$1/pom.xml << END

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.github.wshackle</groupId>
END
  
echo  "    <artifactId>rosjava_messages.$1</artifactId>" >> rosjava_messages/$1/pom.xml

cat >> rosjava_messages/$1/pom.xml << END
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>
    <dependencies>
        <dependency>
            <groupId>com.github.wshackle</groupId>
            <artifactId>rosjava.message_generation</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>

END

for dep in `rospack depends $1 | grep _msgs` ; do
	echo "dep=${dep}"
	cat >> rosjava_messages/$1/pom.xml << END
       <dependency>
            <groupId>com.github.wshackle</groupId>
END
	echo "<artifactId>rosjava_messages.$dep</artifactId>" >> rosjava_messages/$1/pom.xml
	cat >> rosjava_messages/$1/pom.xml << END
             <version>1.0-SNAPSHOT</version>
        </dependency>
END

done


cat >> rosjava_messages/$1/pom.xml << END

    </dependencies>
 
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>
</project>

END

for dep in `rospack depends $1 | grep _msgs` ; do
	if test ! -f rosjava_messages/$dep/pom.xml ; then
    		./make_messages_project.bash $dep
	fi
done



( cd rosjava_messages/$1 ; mvn install ; cd ../.. )







