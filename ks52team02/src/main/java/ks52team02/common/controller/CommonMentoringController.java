package ks52team02.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common")
public class CommonMentoringController {
	
	@GetMapping("/mentoringNoticeDetail")
    public String MoveNoticeDetail() {
    	System.out.println("멘토링 | 멘토링 공고 조회 | 멘토링 공고 상세 조회 화면");
        return  "member/common/mentoting/noticeDetail";
    }
	
	@GetMapping("/mentoringNotice")
	public String movenoticeList() {
    	System.out.println("멘토링 | 멘토링 공고 조회 화면");
        return  "member/common/mentoting/noticeList";
    }

}
