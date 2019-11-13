# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="info@antasya.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 2005

# The application's jar file
ARG JAR_FILE=target/*.jar

# Add the application's jar to the container
ADD ${JAR_FILE} transant-vehicle-health.jar

# Run the jar file
#javaw -Dfile.encoding="UTF-8" -Dsun.jnu.encoding="UTF8" -jar %jarName% --spring.profiles.active=test
#java -jar app.jar --spring.config.location=file:///Users/home/config/jdbc.properties
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dfile.encoding=UTF-8","-jar","/transant-vehicle-health.jar", "--spring.profiles.active=local"]