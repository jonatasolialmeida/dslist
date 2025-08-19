package com.javaspring.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspring.dslist.dto.GameMinDTO;
import com.javaspring.dslist.services.GameService;

@RestController // Anotação que indica que esta classe é um controlador REST
@RequestMapping(value = "/games") // Define o caminho base para as requisições deste controlador
public class GameController {

    @Autowired
    private GameService gameService; // Injeção de dependência do serviço GameService

    @GetMapping // Mapeia requisições GET para o método findAll
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll(); // Chama o serviço para buscar todos os jogos
        return result; // Retorna a lista de jogos

    }
}
