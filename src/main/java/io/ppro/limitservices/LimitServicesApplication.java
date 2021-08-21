package io.ppro.limitservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/***
 * @author Pawan Maurya
 * @since Aug 06, 2021
 */

// ENABLE Hystrix
@EnableHystrix
@SpringBootApplication
public class LimitServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimitServicesApplication.class, args);
    }

}
