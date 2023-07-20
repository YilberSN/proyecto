#
# Build stage
#
FROM maven:3.8.2-jdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:22-slim-bullseye
COPY --from=build /target/proyecto-0.0.1-SNAPSHOT.jar proyecto.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","proyecto.jar"]