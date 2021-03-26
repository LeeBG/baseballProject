package com.cos.baseballspring.web.team;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.baseballspring.domain.repository.StadiumRepository;
import com.cos.baseballspring.domain.repository.TeamRepository;
import com.cos.baseballspring.domain.stadium.Stadium;
import com.cos.baseballspring.domain.team.Team;
import com.cos.baseballspring.dto.TeamSaveReqDto;
import com.cos.baseballspring.service.StadiumService;
import com.cos.baseballspring.service.TeamService;
import com.cos.baseballspring.util.Script;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TeamController {
	private final TeamService teamService;
	private final StadiumService stadiumService;

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/team")
	public String list(Model model) {
		List<Team> entity = teamService.전체가져오기();
		model.addAttribute("dto", entity);
		return "team/list";
	}
	
	@GetMapping("/team/saveForm")
	public String saveForm(Model model, HttpServletResponse response) {
		List<Stadium> entity =stadiumService.전체가져오기();
		if(entity.size() == 0) {
			Script.back(response, "야구장을 등록 후 등록이 가능합니다.");
		}
		model.addAttribute("dto", entity);
		return "team/saveForm";
	}
	
	@PostMapping("/team")
	public String save(String name, int stadiumId) {
		TeamSaveReqDto dto = new TeamSaveReqDto();
		dto.setName(name);
		dto.setStadiumId(stadiumId);
		teamService.저장하기(dto.toEntity());
		return "redirect:/team";
	}
	
	
	@DeleteMapping("/team/{id}")
	public @ResponseBody String delete(@PathVariable Integer id) {
		teamService.삭제하기(id);
		return "ok";
	}
}
