package ks52team02.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberWithdrawalController {
	
	@GetMapping("/withdrawalForm")
    public String removeMember() {
    	System.out.println("탈퇴 신청 화면");
        return  "member/common/withdrawal/applicationWithdrawalForm";
    }
	

}
