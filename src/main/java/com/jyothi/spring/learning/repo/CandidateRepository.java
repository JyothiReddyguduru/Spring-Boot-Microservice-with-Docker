package com.jyothi.spring.learning.repo;

import com.jyothi.spring.learning.model.Candidate;

import org.springframework.data.repository.CrudRepository;

public interface CandidateRepository extends CrudRepository<Candidate, Integer> {
    
    public Candidate findCandidateById(Integer id);
}
