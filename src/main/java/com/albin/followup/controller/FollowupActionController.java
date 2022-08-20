package com.albin.followup.controller;

import com.albin.followup.model.Followup;
import com.albin.followup.service.FollowupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/followup")
public class FollowupActionController {

    @Autowired
    FollowupService followupService;

    @GetMapping("/all")
    public List<Followup> getFollowups(){
        return followupService.findAll();
    }

    @PostMapping("/save")
    public void saveFollowup(@RequestBody Followup followup){
        followupService.save(followup);
        return;
    }
}
