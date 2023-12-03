package com.assignment.cricket.controller;

import com.assignment.cricket.model.Match;
import com.assignment.cricket.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping("/start/{overs}")
    public ResponseEntity<String> startMatch(@PathVariable int overs) {
        String matchId = matchService.startMatch(overs);
        return ResponseEntity.ok("Match started with ID: " + matchId);
    }



    @GetMapping("/details/{matchId}")
    public ResponseEntity<Match> getMatchDetails(@PathVariable String matchId) {
        Match match = matchService.getMatchDetails(matchId);
        return ResponseEntity.ok(match);
    }

}
