FROM java:8
EXPOSE 8080
ADD target/MavenAndGradle.jar springmodules.jar
ENTRYPOINT ["java", "-jar", "springmodules.jar"]