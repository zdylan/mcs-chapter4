#!bin/sh bash
echo "********************************************************"
echo "Starting the Eureka Server"
echo "********************************************************"
#java -Djava.security.egd=file:/dev/./urandom -jar /usr/local/eurekaserver/@project.build.finalName@.jar

java -jar /usr/local/eurekaserver/@project.build.finalName@.jar
