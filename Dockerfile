from eclipse-temurin:21.0.11_10-jre-noble
workdir /app
copy target/*.jar app.jar
entrypoint ["java","-jar","app.jar"]