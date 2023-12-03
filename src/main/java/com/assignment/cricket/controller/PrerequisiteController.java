package com.assignment.cricket.controller;

import com.assignment.cricket.model.Player;
import com.assignment.cricket.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/require")
@AllArgsConstructor
public class PrerequisiteController {

    private final PlayerRepository playerRepository;

    @PostMapping("player")
    public Player createPlayer(@RequestBody Player player){
        return playerRepository.save(player);
    }

}
