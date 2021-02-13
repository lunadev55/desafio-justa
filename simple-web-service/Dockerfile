FROM openjdk

WORKDIR /app

COPY target/simple-web-service-0.0.1-SNAPSHOT.jar /app/simple-web-service.jar

ENTRYPOINT ["java", "-jar", "simple-web-service.jar"]