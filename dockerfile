FROM adoptopenjdk:11-jre-hotspot

WORKDIR /app

COPY target/wiprosample-0.0.1-SNAPSHOT.jar /app/wiprosample-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD [ "java","-jar", "wiprosample-0.0.1-SNAPSHOT.jar"]