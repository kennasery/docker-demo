FROM openjdk:17-oracle

EXPOSE 8091

ADD target/docker-demo.jar /docker-demo.jar

ENTRYPOINT ["java","-jar","docker-demo.jar"]
