FROM openjdk:17

COPY target/k8s_springboot-0.0.1-SNAPSHOT.jar /app/demo.jar

EXPOSE 8080

WORKDIR /app

CMD ["java", "-jar", "demo.jar"]