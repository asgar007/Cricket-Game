package com.assignment.cricket.service;

import com.assignment.cricket.model.Match;
import com.assignment.cricket.model.Team;
import com.assignment.cricket.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MatchServiceImpl implements MatchService {

    private Random random;
    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private PlayerService playerService;

    @Autowired
    private RandomEventGenerator randomEventGenerator;

    public String startMatch(int overs) {
        // Implement match initialization logic, including teams, players, etc.
        Team team1 = Team.builder()
                .teamId("1").teamName("team1")
                .players(playerService.getAllPlayers())
                .build();
        Team team2 = Team.builder()
                .teamId("2").teamName("team2")
                .players(playerService.getAllPlayers())
                .build();

        Match match = Match.builder()
                .matchId("1")
                .battingTeam(team1)
                .bowlingTeam(team2)
                .totalOvers(overs)
                .build();

        //play match
        playMatch(overs);

        matchRepository.save(match);

        return match.getMatchId();
    }

    private void playMatch(int overs) {
        for (int over = 1; over <= overs; over++) {
            System.out.println("Over " + over + ":");


            for (int ball = 1; ball <= 6; ball++) {
                int result = getRandomResult();
                System.out.print(result + " ");
            }

            System.out.println();
        }
    }

    private int getRandomResult() {
        int[] outcomes = {0, 1, 2, 3, 4, 6, 8}; // 8 represents Wicket
        int randomIndex = random.nextInt(outcomes.length);
        return outcomes[randomIndex];
    }

    public Match getMatchDetails(String matchId) {
        return null;
    }

}
