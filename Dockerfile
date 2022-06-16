FROM openjdk:17-oracle
copy ./target/cnb-0.0.1-SNAPSHOT.jar cnb-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","cnb-0.0.1-SNAPSHOT.jar"]