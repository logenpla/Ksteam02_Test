package ks52team02.mentee.mentoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentoring")
public class MenteeMentoringController {

	@GetMapping("/apply")
    public String MoveMentoringApply() {
		
    	System.out.println("멘토링 신청 화면");
        return  "member/mentee/mentoring/mentoringApply";
    }
}
