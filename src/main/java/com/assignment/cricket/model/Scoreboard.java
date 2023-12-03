package com.assignment.cricket.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "scoreboard")
public class Scoreboard {
    @Id
    private String scoreboardId;
    private String matchId;
    private String battingTeamId;
    private String bowlingTeamId;
    private int totalRuns;
    private int totalWickets;
    private int oversCompleted;
}
