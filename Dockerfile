FROM openjdk:11

WORKDIR /app

COPY target/users_docker-0.0.1-SNAPSHOT.jar /app/spring_boot_docker.jar

EXPOSE 8080

SHELL ["/bin/sh", "-c"]

ENTRYPOINT ["java", "-jar", "spring_boot_docker.jar"]
