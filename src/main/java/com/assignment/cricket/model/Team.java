package com.assignment.cricket.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Data
@Builder
@Document

public class Team {
    @Id
    private String teamId;
    private String teamName;
    private List<Player> players; // List of players in the team

}

