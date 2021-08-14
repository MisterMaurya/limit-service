package io.ppro.limitservices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * @author Pawan Maurya
 * @since Aug 06, 2021
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LimitConfig {
    private int maximum;
    private int minimum;
}
