package com.midnight.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.midnight.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{

    
} 