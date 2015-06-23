package org.scratch.greeter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Charles.Wang on 23/06/2015.
 */
@Configuration
public class GreeterConfig
{
    @Bean
    public Greeter greeter()
    {
        return new Greeter1();
    }
}
