package ks52team02.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberRegisterController {
	
	@GetMapping("/registerInfo")
	public String moveJoinInfo() {
		System.out.println("회원가입 | 회원가입 안내 화면");
		return  "member/common/register/registerInfo";
	}
	
	@GetMapping("/registerMentee")
    public String registerMentee() {
    	System.out.println("멘티 회원가입 화면");
        return  "member/common/register/registerMenteeForm";
    }

	@GetMapping("/registerMentor1")
    public String registerMentor1() {
    	System.out.println("멘토 회원가입 화면1");
        return  "member/common/register/registerMentor1Form";
    }

	@GetMapping("/registerMentor2")
    public String registerMento2r() {
    	System.out.println("멘토 회원가입 화면2");
        return  "member/common/register/registerMentor2Form";
    }

}
