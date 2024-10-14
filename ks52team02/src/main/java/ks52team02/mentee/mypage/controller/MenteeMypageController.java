package ks52team02.mentee.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MenteeMypageController {

	// 김광민
	
	@GetMapping("/menteeAccount")
    public String MoveMypageAccount() {
        System.out.println("mypage account 페이지 이동");
        return  "member/mentee/mypage/menteeMypageAccount";
    }
	
	@GetMapping("/menteeIntroduce")
    public String MoveMypageIntroduce() {
        System.out.println("mypage introduce 페이지 이동");
        return  "member/mentee/mypage/menteeMypageIntroduce";
    }
	
	@GetMapping("/menteeCareer")
    public String MoveMypageCareer() {
        System.out.println("mypage career 페이지 이동");
        return  "member/mentee/mypage/menteeMypageCareer";
    }
	
	@GetMapping("/menteeEducationAdd")
    public String MoveMypageEducationAdd() {
        System.out.println("mypage Education 추가 페이지 이동");
        return  "member/mentee/mypage/careerInfo/menteeMypageEducationAdd";
    }

    @GetMapping("/menteeEducationModify")
    public String MoveMypageEducationModify() {
        System.out.println("mypage Education 수정 페이지 이동");
        return  "member/mentee/mypage/careerInfo/menteeMypageEducationModify";
    }
	
    @GetMapping("/menteeCertificateAdd")
    public String MoveMypageCertificateAdd() {
        System.out.println("mypage Certificate 추가 페이지 이동");
        return  "member/mentee/mypage/careerInfo/menteeMypageCertificateAdd";
    }

    @GetMapping("/menteeCertificateModify")
    public String MoveMypageCertificateModify() {
        System.out.println("mypage Certificate 수정 페이지 이동");
        return  "member/mentee/mypage/careerInfo/menteeMypageCertificateModify";
    }
	
    @GetMapping("/menteePortfolioAdd")
    public String MoveMypagePortfolioAdd() {
        System.out.println("mypage Portfolio 추가 페이지 이동");
        return  "member/mentee/mypage/careerInfo/menteeMypagePortfolioAdd";
    }

    @GetMapping("/menteePortfolioModify")
    public String MoveMypagePortfolioModify() {
        System.out.println("mypage Portfolio 수정 페이지 이동");
        return  "member/mentee/mypage/careerInfo/menteeMypagePortfolioModify";
    }
	
	// 황웅
    
	@GetMapping("/menteeGoalSet")
    public String MoveMypageGoalSet() {
        System.out.println("mypage career 페이지 이동");
        return  "member/mentee/mypage/menteeMypageGoalSet";
    }
    
    @GetMapping("/menteeGoalSetting")
    public String MoveMypageGoalSetting() {
        System.out.println("mypage career 페이지 이동");
        return  "member/mentee/mypage/menteeMypageGoalSetting";
    }
    
    @GetMapping("/menteeBlog")
    public String MoveMyBlog() {
        System.out.println("writemyblog 페이지 이동");
        return  "member/mentee/mypage/menteeMypageBlog";
    }
	
    @GetMapping("/writeMyBlog")
    public String MoveWriteMyBlog() {
        System.out.println("writemyblog 페이지 이동");
        return  "member/mentee/mypage/menteeMypageBlogWrite";
    }
	
    @GetMapping("/myBlogExample")
    public String MoveMyBlogExample() {
        System.out.println("writemyblog 페이지 이동");
        return  "member/mentee/mypage/menteeMypageBlogExample";
    }
    
    @GetMapping("/mypageGoalSetDelete")
    public String MoveMypageGoalDelete() {
        System.out.println("mypage career 페이지 이동");
        return  "member/mentee/mypage/menteeMypageGoalDelete";
    }
    
    @GetMapping("/menteeGoalSetUpdate")
    public String MoveMypageGoalUpdate() {
        System.out.println("mypage career 페이지 이동");
        return  "member/mentee/mypage/menteeMypageGoalUpdate";
    }

    
}
