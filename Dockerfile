FROM java:8u111-jre
add zuulstudy.jar  /zuulstudy.jar
EXPOSE 8080
CMD ["java","-jar","zuulstudy.jar"]