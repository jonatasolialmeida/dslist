package com.javaspring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspring.dslist.dto.GameDto;
import com.javaspring.dslist.dto.GameMinDTO;
import com.javaspring.dslist.entities.Game;
import com.javaspring.dslist.projections.GameMinProjection;
import com.javaspring.dslist.repositories.GameRepository;

@Service
public class GameService {

    // Injeção de dependência do repositório GameRepository
    // O Spring Data JPA irá gerenciar a instância do repositório
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true) // Indica que este método é somente leitura
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDto(result);
    }
    
    @Transactional(readOnly = true) // Indica que este método é somente leitura
    public List<GameMinDTO> findAll() {
        
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true) // Indica que este método é somente leitura
    public List<GameMinDTO> findByList(Long listId) {
        
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
