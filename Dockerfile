FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8080
COPY target/eshop-backend-0.0.1-SNAPSHOT.jar eshop-backend.jar
ENTRYPOINT ["java", "-jar", "eshop-backend.jar"]