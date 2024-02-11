FROM eclipse-temurin:19-jre-focal
MAINTAINER ITAcademy

ADD ./target/flat-service.jar /app/

CMD ["java", "-Xmx200m", "-jar", "/app/flat-service.jar"]