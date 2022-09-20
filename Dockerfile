FROM openjdk:latest
COPY  ./target/jobopeningservice-0.0.1-SNAPSHOT.jar job_service.jar
CMD ["java","-jar","/job_service.jar"]