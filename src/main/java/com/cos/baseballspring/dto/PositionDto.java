package com.cos.baseballspring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PositionDto {
	private String position;
	private String lotte;
	private String nc;
	private String kia;
}
