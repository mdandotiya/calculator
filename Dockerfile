FROM openjdk:8
COPY ./target/calculator-minproject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator-minproject-1.0-SNAPSHOT.jar", "Master"]