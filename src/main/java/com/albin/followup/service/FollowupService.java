package com.albin.followup.service;

import com.albin.followup.model.Followup;
import com.albin.followup.repository.FollowupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowupService {

    @Autowired
    FollowupRepository followupRepository;

    public List<Followup> findAll(){
        return followupRepository.findAll();
    }

    public Followup save(Followup followup){
        return followupRepository.save(followup);
    }
}
