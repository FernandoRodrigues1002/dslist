package com.fernando.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.dslist.dto.GameMinDTO;
import com.fernando.dslist.entities.Game;
import com.fernando.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //retorna uma lista do tipo GameMinDTO
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();

        //transforma a lista de Game em uma lista de GameMinDTO
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();

        return dto;
    }
}
