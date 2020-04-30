ARG service_name=todo
ARG version=1.0.0

FROM openjdk:8

ENV SERVER_PORT 9090
EXPOSE $SERVER_PORT

WORKDIR /app
COPY ./target/todo-0.0.1.jar /app/target/todo-0.0.1.jar
COPY ./target/classes/application-docker.yml /app/application-docker.yml

ENTRYPOINT ["java", "-jar", "/app/target/todo-0.0.1.jar", "--spring.config.location=/app/application.yml"]

LABEL service=${serice_name} image=prod build=${version}
