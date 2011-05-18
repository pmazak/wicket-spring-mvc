package com.github.mazak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class AllController {
    @RequestMapping(value="/*.spr")
    void all() {
    }
}