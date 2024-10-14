package ks52team02.mentor.mentoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentoring")
public class MentorMentoringController {
	
	@GetMapping("/noticeAdd")
	public String movenoticeAdd() {
    	System.out.println("멘토링 | 멘토링 공고 등록");
        return  "member/mentor/mentoring/noticeAdd";
    }
	
	@GetMapping("/check")
	public String moveMentoringCheck() {
    	System.out.println("멘토링 | 멘토링관리 이동");
        return  "member/mentor/mentoringManagement/mentoringCheck";
    }

	@GetMapping("/detailCheck")
	public String moveDetailCheck() {
    	System.out.println("멘토링 | 멘토링상세관리 이동");
        return  "member/mentor/mentoringManagement/mentoringCheckDetail";
    }
	
}
