package com.jyothi.spring.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Candidate{

    @Id
    @GeneratedValue
    public int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    
    
}
