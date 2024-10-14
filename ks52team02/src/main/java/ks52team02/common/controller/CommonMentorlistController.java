package ks52team02.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common")
public class CommonMentorlistController {
	
	@GetMapping("/honoraryMentorList")
	public String moveHonerMentorList() {
		System.out.println("멘토찾기 | 명예멘토 조회 화면");
		return  "member/common/mentorList/honoraryMentorList";
	}
	
	@GetMapping("/mentorList") 
	public String moveMentorList() {
		System.out.println("멘토찾기 | 멘토 조회 화면"); 
		return "member/common/mentorList/mentorList"; 
	}

}
