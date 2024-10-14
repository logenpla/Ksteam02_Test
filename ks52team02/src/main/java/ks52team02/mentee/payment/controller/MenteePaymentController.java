package ks52team02.mentee.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payment")
public class MenteePaymentController {
	
	@GetMapping("/paymentList")
	public String getPaymentList() {
		System.out.println("멘토링관리 | 결제 내역 조회 화면");
		return "member/mentee/payment/mentoringPaymentList";
	}
	
	@GetMapping("/success")
	public String paymentStatusIsSuccessView() {
		System.out.println("결제 성공 시 화면");
		return "member/mentee/payment/mentoringPaymentStatusSuccess";
	}
	
	@GetMapping("/fail")
	public String paymentStatusIsFailView() {
		System.out.println("결제 실패 시 화면");
		return "member/mentee/payment/mentoringPaymentStatusFail";
	}
	
	

}
