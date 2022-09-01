package com.wison.wisonspringbootautoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(WisonProperties.class)
@ConditionalOnProperty(value = "wison.name")
public class WisonAutoConfiguration {

    @Autowired
    private WisonProperties wisonProperties;


    @Bean
    public WisonController wisonController(){
        return new WisonController(wisonProperties);
    }

}
