
FROM openjdk:11
MAINTAINER acs
COPY /target/IyB-0.0.1-SNAPSHOT.jar IyB.jar
EXPOSE 7070
ENTRYPOINT ["java","-jar","IyB.jar"]