package com.cos.baseballspring.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.baseballspring.domain.team.Team;

public interface TeamRepository extends JpaRepository<Team, Integer>{
	

}
