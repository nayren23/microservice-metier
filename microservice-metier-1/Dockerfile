FROM openjdk:17

LABEL authors="Nayren"

WORKDIR /app

EXPOSE 8081

COPY ./target/microservice-metier-1-0.0.1-SNAPSHOT.jar /app/microservice-metier.jar

ENTRYPOINT ["java","-jar","microservice-metier.jar"]
