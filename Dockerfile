FROM openjdk:8
COPY ./target/main-devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "main-devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]