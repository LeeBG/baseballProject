package com.cos.baseballspring.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.baseballspring.domain.player.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
