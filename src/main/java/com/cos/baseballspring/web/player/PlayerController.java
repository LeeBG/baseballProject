package com.cos.baseballspring.web.player;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.qlrm.mapper.JpaResultMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.baseballspring.domain.player.Player;
import com.cos.baseballspring.domain.team.Team;
import com.cos.baseballspring.dto.PlayerSaveReqDto;
import com.cos.baseballspring.dto.PositionDto;
import com.cos.baseballspring.service.PlayerService;
import com.cos.baseballspring.service.PositionQuery;
import com.cos.baseballspring.service.TeamService;
import com.cos.baseballspring.util.Script;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PlayerController {
	private final PlayerService playerService;
	private final TeamService teamService;
	private final PositionQuery positionQuery;
	
	@GetMapping("/player/position")
	public String positionlist(Model model) {
		JpaResultMapper jpaResultMapper = new JpaResultMapper();
		List<PositionDto> pdtos = jpaResultMapper.list(positionQuery.positionPivot(), PositionDto.class);
		model.addAttribute("dto",pdtos);
		return "list";
	}
	
	
	@GetMapping("/player")
	public String list(Model model) {
		List<Player> entity = playerService.전체가져오기();
		model.addAttribute("dto", entity);
		return "player/list";
	}
	
	@GetMapping("/player/saveForm")
	public String saveForm(Model model, HttpServletResponse response) {
		List<Team> entity = teamService.전체가져오기();			//전체Team
		if(entity.size() == 0) {
			Script.back(response, "등록 후 가져올 수 있습니다.");
		}
		model.addAttribute("dto", entity);
		return "player/saveForm";
	}
	
	@PostMapping("/player")
	public String save(String name, String position, int teamId) {
		PlayerSaveReqDto dto = new PlayerSaveReqDto();
		dto.setName(name);
		dto.setPosition(position);
		dto.setTeamId(teamId);
		playerService.저장하기(dto.toEntity());
		return "redirect:/player";
	}

	
	@DeleteMapping("/player/{id}")
	public @ResponseBody String delete(@PathVariable Integer id) {
		playerService.삭제하기(id);
		return "ok";
	}
}
