FROM openjdk:21
EXPOSE 8082
ADD target/orderservice-image.jar orderservice-image.jar
ENTRYPOINT ["java","-jar","/orderservice-image.jar"]