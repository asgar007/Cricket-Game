package com.assignment.cricket.service;

import com.assignment.cricket.model.Player;
import com.assignment.cricket.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    private PlayerRepository playerRepository;
    @Override
    public List<Player> getAllPlayers() {
        // Retrieve all players from the database
        return playerRepository.findAll();
    }
}

