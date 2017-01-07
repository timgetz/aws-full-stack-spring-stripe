package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by timge on 1/6/2017.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
