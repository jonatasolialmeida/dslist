package com.javaspring.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Anotação que indica que esta classe é uma entidade JPA
@Entity
@Table(name = "tb_game") // Define o nome da tabela no banco de dados
public class Game {

    @Id // Indica que este atributo é a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que o valor do ID será gerado automaticamente
    private Long id;

    private String title;

    // year é uma palavra reservada em SQL, por isso usamos a anotação @Column para definir um nome diferente na tabela
    @Column(name = "game_year")
    private Integer year;

    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    // construtor padrão sem parâmetros
    // é necessário para o Spring Data JPA criar instâncias da classe
    public Game() {
    }

    // construtor com todos os parâmetros
    // é necessário para criar instâncias da classe com todos os atributos
    public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl,
            String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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

    // Implementação dos métodos hashCode e equals
    // para garantir a comparação correta entre objetos Game
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    // Método equals verifica se dois objetos Game são iguais
    // com base no atributo id, que é único para cada jogo
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }



}


