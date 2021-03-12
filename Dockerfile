FROM openjdk:8
COPY ./target/main-minproject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "main-devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]