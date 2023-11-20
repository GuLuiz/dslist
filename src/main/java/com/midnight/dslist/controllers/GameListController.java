package com.midnight.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.midnight.dslist.dto.GameDTO;
import com.midnight.dslist.dto.GameListDTO;
import com.midnight.dslist.dto.GameMinDTO;
import com.midnight.dslist.entities.Game;
import com.midnight.dslist.services.GameListService;
import com.midnight.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAdll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }


}
