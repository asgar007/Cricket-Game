package com.assignment.cricket.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "player")
public class Player {
    @Id
    private String playerId;
    private String playerName;
    private String playerRole;
}
