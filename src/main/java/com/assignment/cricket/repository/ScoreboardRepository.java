package com.assignment.cricket.repository;

import com.assignment.cricket.model.Scoreboard;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ScoreboardRepository extends MongoRepository<Scoreboard, String> {
    List<Scoreboard> findByMatchId(String matchId);
}
