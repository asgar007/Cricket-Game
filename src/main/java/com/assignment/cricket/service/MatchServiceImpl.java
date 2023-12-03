package com.assignment.cricket.service;

import com.assignment.cricket.model.Match;
import com.assignment.cricket.model.Scoreboard;
import com.assignment.cricket.model.Team;
import com.assignment.cricket.repository.MatchRepository;
import com.assignment.cricket.repository.ScoreboardRepository;
import com.assignment.cricket.util.FinalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class MatchServiceImpl implements MatchService {

//    private Random random;
    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private PlayerService playerService;

    @Autowired
    private ScoreboardRepository scoreboardRepository;

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
        playMatch(overs, match.getMatchId(), team1);//batting team1
        playMatch(overs, match.getMatchId(), team2);//batting team1

        matchRepository.save(match);

        return match.getMatchId();
    }

    private void playMatch(int overs,String matchId, Team team) {
        Scoreboard scoreboard = Scoreboard.builder()
                .matchId(matchId)
                .battingTeamId(team.getTeamId()).oversCompleted(overs).build();
        int wickets = 0;
        int runs = 0;
        for (int over = 1; over <= overs; over++) {
            System.out.println("Over " + over + ":");

            for (int ball = 1; ball <= 6; ball++) {
                int result = getRandomResult();
                if(result == 8){
                    scoreboard.setTotalWickets(wickets++);
                }
                else {
                    runs += result;
                    scoreboard.setTotalRuns(runs);
                }
                System.out.print(result + " ");
            }

            System.out.println();
        }
//        scoreboard.setWinner(team.getTeamName());
        scoreboardRepository.save(scoreboard);

    }

    private int getRandomResult() {
        int[] outcomes = {0, 1, 2, 3, 4, 6, 8}; // 8 represents Wicket
        int randomIndex = new Random().nextInt(outcomes.length);
        return outcomes[randomIndex];
    }

    public FinalResponse getMatchDetails(String matchId) {
        //compare the run of team1 and team2
//        List<Scoreboard> scoreboards = scoreboardRepository.findByMatchId(matchId);
//        scoreboards.forEach((team1Score)-> {
//
//        });
        return null;

    }

}
