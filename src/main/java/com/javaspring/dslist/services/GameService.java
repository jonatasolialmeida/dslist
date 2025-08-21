package com.javaspring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspring.dslist.dto.GameDto;
import com.javaspring.dslist.dto.GameMinDTO;
import com.javaspring.dslist.entities.Game;
import com.javaspring.dslist.repositories.GameRepository;

@Service
public class GameService {

    // Injeção de dependência do repositório GameRepository
    // O Spring Data JPA irá gerenciar a instância do repositório
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true) // Indica que este método é somente leitura
    public GameDto findById(Long gameId){
        Game result = gameRepository.findById(gameId).get();
        GameDto dto = new GameDto(result);
        return dto;
    }
    
    @Transactional(readOnly = true) // Indica que este método é somente leitura
    public List<GameMinDTO> findAll() {
        
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}
