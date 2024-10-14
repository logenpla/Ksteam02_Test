package ks52team02.mentor.adjustment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adjustment")
public class MentorAdjustmentController {

	@GetMapping("/adjustmentList")
	public String getMentorAdjustmentList() {
		System.out.println("멘토링관리 | 정산내역 조회 화면");
		return "member/mentor/adjustment/adjustmentHistoryList";
	}
	
}
