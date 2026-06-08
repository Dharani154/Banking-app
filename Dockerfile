FROM openjdk:17

COPY target/banking-app-1.0.jar banking.jar

CMD ["java","-jar","banking.jar"]
