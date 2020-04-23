package com.zln.bookkeeping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/index")
    public String show(){
        return "index";
    }

}
