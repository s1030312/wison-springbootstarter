package com.wison.wisonspringbootautoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "wison")
public class WisonProperties {

    public String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
