FROM openjdk:8
EXPOSE 8080
ADD target/myproject.jar myproject.jar
ENTRYPOINT ["java","-jar","/myproject.jar"]