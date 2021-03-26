package com.cos.baseballspring.dto;

import com.cos.baseballspring.domain.stadium.Stadium;

import lombok.Data;
@Data
public class StadiumSaveReqDto {
	private String name;
	
	public Stadium toEntity() {
		return Stadium.builder().name(name).build();
	}
}
