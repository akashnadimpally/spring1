FROM openjdk:11-jdk
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

EXPOSE 8080

WORKDIR /app
COPY . /app/
# COPY src /app/src
# RUN ./mvnw package -DskipTests
RUN mvn clean install compile package

CMD ["java", "-jar", "target/spring1-0.0.1-SNAPSHOT.war"]