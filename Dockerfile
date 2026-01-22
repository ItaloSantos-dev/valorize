FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests


FROM eclipse-temurin:21
LABEL authors="ItaloUser"
WORKDIR /app
COPY --from=builder /app/target/valorize-0.0.1-SNAPSHOT.jar /app/valorize.jar
ENTRYPOINT ["java", "-jar", "valorize.jar"]