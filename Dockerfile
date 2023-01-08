FROM amazoncorretto:19-alpine-jdk

MAINTAINER daviss

COPY target/portfolioBackEnd-0.0.1-SNAPSHOT.jar portfolio.jar

ENTRYPOINT ["java","-jar","/portfolio.jar"]