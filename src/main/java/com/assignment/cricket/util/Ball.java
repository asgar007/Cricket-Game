package com.assignment.cricket.util;

import lombok.Data;

@Data
public class Ball {
    private String event; // Runs, Wicket, Wide, No Ball
    private int runs;
    private String wicketType;
}
