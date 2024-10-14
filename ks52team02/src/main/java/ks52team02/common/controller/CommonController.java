package ks52team02.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
	
	@GetMapping("/")
	public String moveIndex() {
		System.out.println("사용자 메인 화면");
		return "member/index";
	}
	
}
