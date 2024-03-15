FROM eclipse-temurin:17
COPY target/webapp1.jar webapp1.jar
CMD [ "java","-jar","webapp1.jar" ]