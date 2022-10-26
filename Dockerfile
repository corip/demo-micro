FROM openjdk:11
ADD "./target/demo2-0.0.1-SNAPSHOT.jar" "demo2-app.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","/demo2-app.jar"]