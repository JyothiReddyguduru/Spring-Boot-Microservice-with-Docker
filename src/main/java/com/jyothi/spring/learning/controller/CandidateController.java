package com.jyothi.spring.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jyothi.spring.learning.model.Candidate;
import com.jyothi.spring.learning.repo.CandidateRepository;

@RestController
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;

    @PostMapping("/add")
    public String addCandidate(@RequestParam String first, @RequestParam String last) {
        Candidate customer = new Candidate();
        customer.setFirstName(first);
        customer.setLastName(last);
        candidateRepository.save(customer);
        return "Added new customer to repo!";
    }

    
}
