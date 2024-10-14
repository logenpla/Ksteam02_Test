package ks52team02.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common")
public class CommonPortfolioController {
	
	@GetMapping("/portfolio")
    public String MovePortfolio() {
    	System.out.println("포트폴리오 | 멘티의 포트폴리오 전체 조회 화면");
        return  "member/common/portfolio/allMenteePortfolioList";
    }
	
	@GetMapping("/portfolioDetail")
    public String MovePortfolioDetail() {
    	System.out.println("포트폴리오 상세 조회 화면");
        return  "member/common/portfolio/menteePortfolioDetail";
    }

}
