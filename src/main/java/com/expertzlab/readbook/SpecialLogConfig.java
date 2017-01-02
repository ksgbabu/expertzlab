package com.expertzlab.readbook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.PrintStream;

/**
 * Created by gireeshbabu on 13/12/16.
 */
@Configuration
public class SpecialLogConfig {

    @Bean
    public SpecialLogAssociated getLog(){
        return new SpecialLogAssociated();
    }

    @Bean
    public PrintStream specialLogStream(){
        return System.out;
    }
}
