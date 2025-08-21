package com.javaspring.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.javaspring.dslist.entities.Game;

public class GameDto {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDto() {
    }
    
    public GameDto(Game entity) {
       // Construtor que recebe uma entidade Game e inicializa os campos do DTO
        // Utilizando BeanUtils para copiar as propriedades da entidade para o DTO
        // Isso permite que o DTO seja criado a partir de uma entidade existente
        // não é necessário passar o this, pois estamos dentro da classe do DTO
        // e podemos acessar diretamente os atributos da entidade Game
        // também é uma mão na roda caso o objeto seja muito grande
        // e não seja necessário passar todos os atributos, pois o BeanUtils irá copiar apenas os
        // atributos que existem no DTO e na entidade
        // Atribuindo os valores dos atributos da entidade Game aos atributos do DTO 
       BeanUtils.copyProperties(entity, this);
    }

    // para funcionar com o Beans 
    // é necessário ter os getters e setters para todos os atributos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    
}
