package com.expertzlab.demoapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gireeshbabu on 28/11/16.
 */

@RestController
class HelloController {

    @RequestMapping("/first")
    public String hello() {
        return "Hello World";
    }
}
