package com.javaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    // Este repositório herda métodos para operações CRUD e consultas personalizadas
    // relacionados à entidade Game. Não é necessário adicionar métodos adicionais
    // a menos que haja consultas específicas que você queira implementar.

}
