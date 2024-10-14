package ks52team02.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberLoginController {
	
	@GetMapping("/login")
	public String loginView() {
		System.out.println("로그인 화면");
		return  "member/common/login/login";
	}
	
	@GetMapping("/findPassword")
	public String findPasswordView() {
		System.out.println("로그인 | 비밀번호 찾기 화면");
		return  "member/common/login/findPassword";
	}

}
