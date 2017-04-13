package com.blog.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Snail Q
 * Date 2017/4/13.
 * Time 15:34
 */
@Controller
@RequestMapping("/mvc")
public class MainController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
