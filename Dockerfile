FROM openjdk:17-jdk
COPY target/spring-hotel-management-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8094:8094
ENTRYPOINT ["java","-jar","app.jar"]