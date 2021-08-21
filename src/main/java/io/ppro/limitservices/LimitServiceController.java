package io.ppro.limitservices;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author Pawan Maurya
 * @since Aug 05, 2021
 */

@RestController
public class LimitServiceController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limit/value")
    public LimitConfig getLimitConfig() {
        return new LimitConfig(configuration.getMaximum(), configuration.getMinimum());
    }

    @GetMapping("/faultToleranceExample/{a}")
    @HystrixCommand(fallbackMethod = "myFallBackMethod")
    public LimitConfig faultToleranceExample(@PathVariable int a) {
        System.out.println(a);
        throw new RuntimeException();
    }

    public LimitConfig myFallBackMethod(int a) {
        System.out.println(a);
        return new LimitConfig(100,11111);
    }

}
