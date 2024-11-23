FROM eclipse-temurin:17
COPY target/bankapi.jar bankapi.jar
CMD [ "java", "-jar", "bankapi.jar" ]