package com.midnight.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.midnight.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long>{

    
} 