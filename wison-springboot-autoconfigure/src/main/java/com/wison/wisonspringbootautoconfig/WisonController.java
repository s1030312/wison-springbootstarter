package com.wison.wisonspringbootautoconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WisonController {

    WisonProperties wisonProperties;

    public WisonController(WisonProperties wisonProperties){
        this.wisonProperties = wisonProperties;
    }

    @GetMapping("/test")
    public String index(){
        return wisonProperties.getName() + " 欢迎";
    }

}
