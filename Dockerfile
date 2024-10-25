FROM eclipse-temurin:17-alpine

WORKDIR /app
COPY target/sp3-aws-sample-1.jar.jar sp3-aws-sample-1.jar
EXPOSE 8080
CMD ["java", "-jar", "sp3-aws-sample-1.jar"]