package com.cos.baseballspring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.baseballspring.domain.repository.TeamRepository;
import com.cos.baseballspring.domain.team.Team;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TeamService {
	private final TeamRepository teamRepository;
	
	@Transactional(readOnly = true)
	public List<Team> 전체가져오기(){
		return teamRepository.findAll();
	}
	@Transactional
	public Team 저장하기(Team team) {
		return teamRepository.save(team);
	}
	@Transactional
	public void 삭제하기(Integer id) {
		teamRepository.deleteById(id);
	}
}
