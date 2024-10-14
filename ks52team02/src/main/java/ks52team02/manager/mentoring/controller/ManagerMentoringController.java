package ks52team02.manager.mentoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerMentoringController {
	
	@GetMapping("/mentoringNoticeList")
    public String dormantMembers() {
    	System.out.println("멘토링 공고 조회 페이지 이동");
        return  "manager/mentoring/mentoringNoticeList";
    }

	@GetMapping("/mentoringGoalSetList")
    public String moveMentoringGoalSetList() {
    	System.out.println("멘토링 목표설정 페이지 이동");
        return  "manager/mentoring/mentoringGoalSetList";
    }

	@GetMapping("/mentoringGoalSettingList")
    public String moveMentoringGoalSettingList() {
    	System.out.println("멘토링 목표진행(블로그) 페이지 이동");
        return  "manager/mentoring/mentoringGoalSettingList";
    }
	
	@GetMapping("/mentoringMatchingList")
    public String getMentoringMatchingList() {
    	System.out.println("멘토링 매칭리스트 페이지 이동");
        return  "manager/mentoring/mentoringMatchingList";
    }
	
	@GetMapping("/mentoringProgressList")
    public String getMentoringProgressList() {
    	System.out.println("멘토링 진행상태 페이지 이동");
    	return  "manager/mentoring/mentoringProgressList";
    }
	
	@GetMapping("/mentoringTimeContentList")
    public String   getMentoringPerHourContent() {
    	System.out.println("멘토링 진행상태 페이지 이동");
    	return  "manager/mentoring/mentoringTimeContentList";
    }
}
