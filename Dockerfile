FROM openjdk:19
copy target/SpringBootExample-0.0.1-SNAPSHOT.jar SpringBootExample-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/SpringBootExample-0.0.1-SNAPSHOT.jar"]