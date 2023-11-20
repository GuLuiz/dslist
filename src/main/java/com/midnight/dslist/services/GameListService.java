package com.midnight.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.midnight.dslist.dto.GameDTO;
import com.midnight.dslist.dto.GameListDTO;
import com.midnight.dslist.dto.GameMinDTO;
import com.midnight.dslist.entities.Game;
import com.midnight.dslist.entities.GameList;
import com.midnight.dslist.repositories.GameListRepository;
import com.midnight.dslist.repositories.GameRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }


}
