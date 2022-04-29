package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping(value = "/abc")
    @ResponseBody
    public String abc() {
        return "abc";
    }
}
