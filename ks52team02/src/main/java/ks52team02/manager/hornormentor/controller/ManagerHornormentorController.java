package ks52team02.manager.hornormentor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/manager")
public class ManagerHornormentorController {
	
	
	@GetMapping("/honoraryMentorCriteria")
	public String managerHonoraryMentorCriteriaList() {
		System.out.println("관리자 명예멘토 기준 조회 내역 화면");
		return  "manager/honorary/honoraryMentorCriteriaList";
	}
	
	@GetMapping("/honoraryMentor")
	public String managerHonoraryMentorList() {
		System.out.println("관리자 명예멘토 조회 화면");
		return  "manager/honorary/honoraryMentorList";
	}

}
