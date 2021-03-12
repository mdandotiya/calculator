FROM openjdk:8
COPY ./target/main-minproject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "Main-minproject-1.0-SNAPSHOT.jar", "Main"]