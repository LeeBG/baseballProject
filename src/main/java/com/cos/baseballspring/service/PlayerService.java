package com.cos.baseballspring.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.baseballspring.domain.player.Player;
import com.cos.baseballspring.domain.repository.PlayerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlayerService {
	private final PlayerRepository playerRepository;
	
	@Transactional(readOnly = true)
	public List<Player> 전체가져오기(){
		return playerRepository.findAll();
	}
	@Transactional
	public Player 저장하기(Player player) {
		return playerRepository.save(player);
	}
	@Transactional
	public void 삭제하기(Integer id) {
		playerRepository.deleteById(id);
	}
	
}
