package com.cos.baseballspring.dto;

import com.cos.baseballspring.domain.stadium.Stadium;
import com.cos.baseballspring.domain.team.Team;

import lombok.Data;

@Data
public class TeamSaveReqDto {
	private String name;
	private Integer stadiumId;
	
	public Team toEntity() {
		return Team.builder().name(name).stadium(Stadium.builder().id(stadiumId).build()).build();
	}
}
