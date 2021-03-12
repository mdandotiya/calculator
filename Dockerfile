FROM openjdk:8
COPY ./target/main-minproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "main-minproject-1.0-SNAPSHOT-jar-with-dependencies.jar"]