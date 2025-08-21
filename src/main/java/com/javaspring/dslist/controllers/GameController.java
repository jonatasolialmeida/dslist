package com.javaspring.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspring.dslist.dto.GameDto;
import com.javaspring.dslist.dto.GameMinDTO;
import com.javaspring.dslist.services.GameService;

@RestController // Anotação que indica que esta classe é um controlador REST
@RequestMapping(value = "/games") // Define o caminho base para as requisições deste controlador
public class GameController {

    @Autowired
    private GameService gameService; // Injeção de dependência do serviço GameService

    @GetMapping(value = "/{gameId}") // Mapeia requisições GET para o método findAllGameDto
    public GameDto findById(@PathVariable Long gameId) {
        GameDto result = gameService.findById(gameId); // Chama o serviço para buscar todos os jogos como GameDto
        return result; // Retorna a lista de jogos como GameDto
    }

    @GetMapping // Mapeia requisições GET para o método findAll
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll(); // Chama o serviço para buscar todos os jogos
        return result; // Retorna a lista de jogos

    }

}
