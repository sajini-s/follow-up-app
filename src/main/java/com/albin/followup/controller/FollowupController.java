package com.albin.followup.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FollowupController {

    @GetMapping("/")
    public String getFollowup(){
        return "index";
    }
}
