package com.assignment.cricket.service;

import com.assignment.cricket.model.Match;

public interface MatchService {
    String startMatch(int overs);
    Match getMatchDetails(String matchId);
}
