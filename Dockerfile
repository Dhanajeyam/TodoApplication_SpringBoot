FROM openjdk:17-jdk-alpine
COPY target/*.jar spring-boot-3-todo-application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-boot-3-todo-application.jar"]