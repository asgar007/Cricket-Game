package com.assignment.cricket.repository;

import com.assignment.cricket.model.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository extends MongoRepository<Match,String> {
}
