FROM eclipse-temurin:17
COPY target/docpractice.jar docpractice.jar
CMD [ "java","-jar","docpractice.jar" ]