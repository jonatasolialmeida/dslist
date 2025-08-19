package com.javaspring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaspring.dslist.dto.GameMinDTO;
import com.javaspring.dslist.entities.Game;
import com.javaspring.dslist.repositories.GameRepository;

@Service
public class GameService {

    // Injeção de dependência do repositório GameRepository
    // O Spring Data JPA irá gerenciar a instância do repositório
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
