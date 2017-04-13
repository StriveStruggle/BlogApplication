package com.blog.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lenovo on 2017/4/11.
 */
@RequestMapping("/mvc")
@Controller
public class MvcController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        System.out.println("¹þ¹þ£¬ÄãÀ´ÁËÃ»");
        return "helloController";
    }
}
