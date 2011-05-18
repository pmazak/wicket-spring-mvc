package com.github.mazak.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HelloController {
    @RequestMapping( {"hello.do", "HelloPage.do"} )
    Map hello() {
        Map attrs = new HashMap();
        attrs.put("message", ", from Spring Controller.");
        return attrs;
    }
}