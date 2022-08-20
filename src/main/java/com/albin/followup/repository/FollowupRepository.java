package com.albin.followup.repository;


import com.albin.followup.model.Followup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FollowupRepository extends JpaRepository<Followup, Integer> {

    List<Followup> findAll();

    Optional<Followup> findByFollowupId(Integer followupId);
}
