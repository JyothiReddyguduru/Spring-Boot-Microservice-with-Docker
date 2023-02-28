package com.jyothi.spring.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        return "Added new candidate to repo!";
    }

    @GetMapping("/list")
    public Iterable<Candidate> getCustomers() {
        return candidateRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Candidate findCustomerById(@PathVariable Integer id) {
        return candidateRepository.findCandidateById(id);
    }

    
}
