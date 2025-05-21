package com.fernando.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    // JpaRepository é uma interface do Spring Data JPA que fornece métodos para operações CRUD
    // e consultas em entidades no banco de dados.
    // O primeiro parâmetro é a entidade (Game) e o segundo é o tipo do identificador (Long).

    

}
