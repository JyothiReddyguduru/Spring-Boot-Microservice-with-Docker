package com.jyothi.spring.learning.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Candidate{

    @Id
    @GeneratedValue
    public int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @OneToMany
    private List<Experience> experiences;
    
}
