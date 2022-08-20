package com.albin.followup.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "follow_up")
@Getter
@Setter
public class Followup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int followupId;

    private String title;

    private String matter;

    private Date followupDate;

    @CreationTimestamp
    private Timestamp createdDate;
}
