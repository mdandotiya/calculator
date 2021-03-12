FROM openjdk:8
COPY ./target/main-minproject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Main-minproject-1.0-SNAPSHOT.jar", "Main"]