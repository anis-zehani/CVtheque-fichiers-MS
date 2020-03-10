### STAGE 1: Build ###
FROM openjdk:8-alpine
ADD target/fichiers-MS.jar fichiers-MS.jar
RUN mkdir uploads
ENTRYPOINT ["java","-jar","/fichiers-MS.jar"]
