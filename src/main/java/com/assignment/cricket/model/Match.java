package com.assignment.cricket.model;

import com.assignment.cricket.util.Over;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "match")
public class Match {
    @Id
    private String matchId;
    private Team battingTeam;
    private Team bowlingTeam;
    private int totalOvers;
    private String winnerteamId;
    private String looserTeamId;
//    private List<Over> overs;
}
