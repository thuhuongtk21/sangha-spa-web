# Bước 1: Build (Sử dụng Maven và Temurin Java 17)
FROM maven:3.8.5-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# Bước 2: Chạy (Sử dụng Eclipse Temurin Java 17 - Cực kỳ ổn định)
FROM eclipse-temurin:17-jdk-focal
COPY --from=build /target/*.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]