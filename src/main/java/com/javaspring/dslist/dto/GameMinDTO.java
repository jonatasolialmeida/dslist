package com.javaspring.dslist.dto;

import com.javaspring.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {

        // Construtor que recebe uma entidade Game e inicializa os campos do DTO
        // Isso permite que o DTO seja criado a partir de uma entidade existente
        // não é necessário passar o this, pois estamos dentro da classe do DTO
        // e podemos acessar diretamente os atributos da entidade Game
        // também não existe uma ambiguidade por não estar usando parametros, pois estamos usando o nome da classe Game
        // para referenciar a entidade e o nome do DTO para referenciar o DTO
        // Atribuindo os valores dos atributos da entidade Game aos atributos do DTO
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
