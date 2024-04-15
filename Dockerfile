FROM adoptopenjdk/openjdk11:alpine
EXPOSE 8080

COPY --chown=appuser:appuser target/*.jar spring-action.jar
ENTRYPOINT ["java","-jar","/spring-action.jar"]