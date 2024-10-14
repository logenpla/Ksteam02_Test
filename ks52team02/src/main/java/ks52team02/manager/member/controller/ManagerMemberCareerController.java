package ks52team02.manager.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerMemberCareerController {

	@GetMapping("/mentorCareerWork")
    public String mentorCareerWork() {
        System.out.println("멘토 근무경력 승인 페이지 이동");
        return  "manager/mentorCareer/mentorWorkApprove";
    }

    @GetMapping("/mentorCareerProject")
    public String mentorCareerProject() {
        System.out.println("멘토 기술경력 승인 페이지 이동");
        return  "manager/mentorCareer/mentorProjectApprove";
    }

    @GetMapping("/mentorCareerEducation")
    public String mentorCareerEducation() {
        System.out.println("멘토 학력 승인 페이지 이동");
        return  "manager/mentorCareer/mentorEducationApprove";
    }

    @GetMapping("/mentorCareerCertificate")
    public String mentorCareerCertificate() {
        System.out.println("멘토 자격증 승인 페이지 이동");
        return  "manager/mentorCareer/mentorCertificateApprove";
    }
	
}
