FROM openjdk:17
LABEL maintainer = "pierre Edimo Nkoe"
ADD target/email-api.jar email-api.jar
ENTRYPOINT ["java", "-jar", "email-api.jar"]