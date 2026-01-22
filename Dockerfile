FROM eclipse-temurin:21

LABEL authors="ItaloUser"
WORKDIR /app
COPY target/valorize-0.0.1-SNAPSHOT.jar /app/valorize.jar
ENTRYPOINT ["java", "-jar", "valorize.jar"]