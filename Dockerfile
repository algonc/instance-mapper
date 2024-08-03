FROM amazoncorretto:21-alpine

RUN addgroup -S app && adduser -S app -G app

USER app:app

COPY --chown=app:app target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
