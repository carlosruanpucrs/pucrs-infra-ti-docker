FROM openjdk:11

RUN apt-get update

WORKDIR /app

COPY target/users_docker-0.0.1-SNAPSHOT.jar /app/spring-api-users.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring-api-users.jar"]
