
FROM openjdk:11
MAINTAINER acs
COPY /target/portfolioBackEnd-0.0.1-SNAPSHOT.jar portfolioBackEnd.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","portfolioBackEnd.jar"]