FROM eclipse-temurin:21
COPY --chown=appuser:appuser ./target/demo-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
CMD ["java", "-jar", "/app.jar"]