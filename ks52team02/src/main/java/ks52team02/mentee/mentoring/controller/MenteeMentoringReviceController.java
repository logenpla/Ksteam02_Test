package ks52team02.mentee.mentoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/review")
public class MenteeMentoringReviceController {
	
	@GetMapping("/reviewList")
	public String getReviewListByMentee() {
		System.out.println("멘토링관리 | 내가 쓴 후기 조회 화면");
		return "member/mentee/review/reviewListByMentee";
	}
	
	@GetMapping("/reviewForm")
	public String addMentoringReview() {
		System.out.println("멘토링관리 | 멘토링 후기 등록 화면");
		return "member/mentee/review/reviewForm";
	}
	
	@GetMapping("/reviewModify")
	public String modifyMentoringReview() {
		System.out.println("멘토링관리 | 내가 쓴 후기 조회 | 멘토링 후기 수정 화면");
		return "member/mentee/review/reviewModifyForm";
	}

}
