# Limit Service - Setup to connect with Spring cloud Config server

## bootstrap.properties


```java
# THE PROPERTIES WILL WE READ FROM OTHER CONFIG SEVER
# FOR OTHER PROPERTIES, WE HAVE TO CREATE bootstrap.properties FILE

spring.application.name=limit-service
server.port=8080

#TO CONNECT WITH CONFIG SERVER
spring.cloud.config.uri=http://localhost:8888/

#SPECIFY THE CONFIG PROPERTIES
spring.profiles.active=dev
#IT WILL USE THE PROPERTY FROM "limit-service-dev.properties"
#IF YOU WILL PROVIDE THE "spring.profiles.active=prod" then it will use from "limit-service-prod.properties"
#IF YOU WILL NOT SPECIFY ANY ACTIVE PROFILE THEN IT WILL USE "limit-service.properties"

#localhost:8080/limit/value For now it will get the from dev properties

```

## Main Class

```java
/***
 * @author Pawan Maurya
 * @since Aug 06, 2021
 */

@SpringBootApplication
public class LimitServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimitServicesApplication.class, args);
    }

}
```

## pom.xml

```java
  <!-- TO CONNECT WITH CONFIG SEVER-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-config</artifactId>
    </dependency>

<!--TO READ THE PROPERTIES FROM BOOTSTRAP PROPERTIES INSTEAD OF APPLICATION PROPERTIES-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-bootstrap</artifactId>
    </dependency>

```
    