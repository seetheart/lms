# Use lightweight Java runtime
FROM eclipse-temurin:21-jdk-jammy

MAINTAINER lms.com

# Copy jar file
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]