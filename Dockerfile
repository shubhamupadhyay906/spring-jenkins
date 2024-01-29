# start with base image containing java runtime
FROM openjdk:17
#make port available outside this container
EXPOSE 8080
ADD target/jenkins-testing-0.0.1-SNAPSHOT.jar jenkins-testing-0.0.1-SNAPSHOT.jar
#rub the jar file
ENTRYPOINT ["java", "-jar", "/jenkins-testing-0.0.1-SNAPSHOT.jar"]