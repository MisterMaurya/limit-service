package io.ppro.limitservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
