FROM amazoncorretto:11-alpine-jdk

MAINTAINER tunombre_o_alias

COPY target/portfolioBackEnd-0.0.1-SNAPSHOT.jar portfolio.jar

ENTRYPOINT ["java","-jar","/portfolio.jar"]