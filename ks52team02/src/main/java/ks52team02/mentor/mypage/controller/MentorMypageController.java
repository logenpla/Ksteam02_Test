package ks52team02.mentor.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MentorMypageController {

	@GetMapping("/mentorAccount")
    public String MoveMypageAccount() {
        System.out.println("mypage account 페이지 이동");
        return  "member/mentor/mypage/mentorMypageAccount";
    }

    @GetMapping("/mentorCareer")
    public String MoveMypageCareer() {
        System.out.println("mypage career 페이지 이동");
        return  "member/mentor/mypage/mentorMypageCareer";
    }
    
    @GetMapping("/mentorWorkAdd")
    public String MoveMypageWorkAdd() {
        System.out.println("mypage Work 추가 페이지 이동");
        return  "member/mentor/mypage/careerInfo/mentorMypageWorkAdd";
    }
    
    @GetMapping("/mentorWorkModify")
    public String MoveMypageWorkModify() {
        System.out.println("mypage Work 수정 페이지 이동");
        return  "member/mentor/mypage/careerInfo/mentorMypageWorkModify";
    }
    
    @GetMapping("/mentorProjectAdd")
    public String MoveMypageProjectAdd() {
        System.out.println("mypage Project 추가 페이지 이동");
        return  "member/mentor/mypage/careerInfo/mentorMypageProjectAdd";
    }
    
    @GetMapping("/mentorProjectModify")
    public String MoveMypageProjectModify() {
        System.out.println("mypage Project 수정 페이지 이동");
        return  "member/mentor/mypage/careerInfo/mentorMypageProjectModify";
    }
    
    @GetMapping("/mentorEducationAdd")
    public String MoveMypageEducationAdd() {
        System.out.println("mypage Education 추가 페이지 이동");
        return  "member/mentor/mypage/careerInfo/mentorMypageEducationAdd";
    }
    
    @GetMapping("/mentorEducationModify")
    public String MoveMypageEducationModify() {
        System.out.println("mypage Education 수정 페이지 이동");
        return  "member/mentor/mypage/careerInfo/mentorMypageEducationModify";
    }
    
    @GetMapping("/mentorCertificateAdd")
    public String MoveMypageCertificateAdd() {
        System.out.println("mypage Certificate 추가 페이지 이동");
        return  "member/mentor/mypage/careerInfo/mentorMypageCertificateAdd";
    }
    
    @GetMapping("/mentorCertificateModify")
    public String MoveMypageCertificateModify() {
        System.out.println("mypage Certificate 수정 페이지 이동");
        return  "member/mentor/mypage/careerInfo/mentorMypageCertificateModify";
    }
}
