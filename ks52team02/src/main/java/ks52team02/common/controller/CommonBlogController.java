package ks52team02.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common")
public class CommonBlogController {
	
	@GetMapping("/blog")
	public String menteeBlogListView() {
		System.out.println("블로그 | 전체 멘티 블로그 조회 화면");
		return  "member/common/blog/allMenteeBlogList";
	}

}
