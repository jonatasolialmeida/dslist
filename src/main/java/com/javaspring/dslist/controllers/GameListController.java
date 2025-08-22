package com.javaspring.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspring.dslist.dto.GameListDto;
import com.javaspring.dslist.dto.GameMinDTO;
import com.javaspring.dslist.services.GameListService;
import com.javaspring.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService; 

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> result = gameListService.findAll(); 
        return result;
    }

    @GetMapping(value = "/{listId}/games") // Mapeia requisições GET para o método findAll
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId); // Chama o serviço para buscar todos os jogos
        return result; // Retorna a lista de jogos

    }
}