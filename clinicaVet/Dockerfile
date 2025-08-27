FROM openjdk:17
WORKDIR /app
ARG JAR_FILE=target/clinicaVet-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_veterinaria.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_veterinaria.jar"]