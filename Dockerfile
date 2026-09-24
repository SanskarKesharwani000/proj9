FROM eclipse-temurin:17-jdk

COPY target/proj9.jar /user/app

WORKDIR /user/app

EXPOSE 9090

ENTRYPOINT [ "java" , "-jar" , "proj9.jar" ]