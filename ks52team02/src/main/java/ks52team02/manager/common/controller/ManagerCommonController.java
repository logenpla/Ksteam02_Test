package ks52team02.manager.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerCommonController {

	@GetMapping("/managerMain")
    public String managerPageMove() {
    	System.out.println("관리자 메인 화면");
        return  "manager/managerMain";
    }
	
	@GetMapping("/managerWithdrawal")
    public String managerWithdrawal() {
    	System.out.println("관리자 탈퇴 페이지 이동");
        return  "manager/setting/managerWithdrawal";

    }
}
