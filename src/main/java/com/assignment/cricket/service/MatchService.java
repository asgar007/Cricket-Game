package com.assignment.cricket.service;

import com.assignment.cricket.model.Match;
import com.assignment.cricket.model.Scoreboard;
import com.assignment.cricket.util.FinalResponse;

public interface MatchService {
    String startMatch(int overs);
    FinalResponse getMatchDetails(String matchId);
}
