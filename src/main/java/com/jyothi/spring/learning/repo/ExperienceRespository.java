package com.jyothi.spring.learning.repo;

import com.jyothi.spring.learning.model.Candidate;
import com.jyothi.spring.learning.model.Experience;

import org.springframework.data.repository.CrudRepository;

public interface ExperienceRespository extends CrudRepository<Experience, Integer> {
    
    public Candidate findCandidateById(Integer id);
    
}
