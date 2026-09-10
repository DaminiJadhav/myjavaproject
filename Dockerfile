FROM eclipse-temurin:21-jre
WORKDIR /app
EXPOSE 8383
#ADD target/myproject.jar app.jar
#COPY target/*.jar app.jar
COPY target/myproject.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]