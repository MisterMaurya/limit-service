package io.ppro.limitservices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/***
 * @author Pawan Maurya
 * @since Aug 06, 2021
 */

@Data
@Component
@ConfigurationProperties
public class Configuration {
    private int maximum;
    private int minimum;
}
