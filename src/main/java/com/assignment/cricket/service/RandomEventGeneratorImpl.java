package com.assignment.cricket.service;

import org.springframework.stereotype.Service;

@Service
public class RandomEventGeneratorImpl implements RandomEventGenerator{
    @Override
    public String generateRandomEvent() {
        // Implement logic to generate random events (runs, wickets, wide, no ball)
        return null;
    }
    @Override
    public String generateWicketType() {
        // Implement logic to generate random wicket type (bowled, runout, catch, lbw, etc.)
        return null;
    }
}

