#!/bin/bash

#set -x;

for d in * ; do
    if test -d "${d}" -a ! -f "${d}/pom.xml"; then
	echo "d=${d}";
	cat std_msgs/pom.xml | sed "s#std_msgs#${d}#g" > "${d}/pom.xml"
	echo "<module>${d}</module>" >> modules.xml
    else
	echo "skip ${d}"; 
    fi
done
