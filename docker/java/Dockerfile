FROM openjdk:11-jdk

#RUN chmod +x /usr/bin/wait-for-it

RUN mkdir jar

#COPY ./dist/rest-service-0.0.1-SNAPSHOT.jar /jar/rest-service-0.0.1-SNAPSHOT.jar

WORKDIR /jar

EXPOSE 10000

ENTRYPOINT ["java", "-jar", "rest-service-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["java", "-h"]
