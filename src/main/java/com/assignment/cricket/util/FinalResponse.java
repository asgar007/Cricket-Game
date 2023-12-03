package com.assignment.cricket.util;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FinalResponse {
    private String matchName;
    private String winner;
    private int winnerRuns;
    private int winnerWickets;

    private String runner;
    private int runnerRuns;
    private int runnerWickets;

}
