FROM amazoncorretto:11-alpine-jdk

MAINTAINER DavidGinaca

COPY target/portfolioBackEnd-0.0.1-SNAPSHOT.jar portfolioBackEnd.jar

ENTRYPOINT ["java","-jar","/NAME-YOUR-FILE-BUILD-SPRINGBOOT.jar"]