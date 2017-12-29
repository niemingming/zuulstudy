FROM jdkwithmaven:v0.0.1
run mvn clean package -Dmaven.test.skip -U
add target/zuulstudy-1.0-SNAPSHOT.jar  /zuulstudy.jar
EXPOSE 8080
CMD ["java","-jar","zuulstudy.jar"]
