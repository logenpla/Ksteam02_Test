package ks52team02.mentee.mentoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/management")
public class MenteeMentoringManagementController {

	
	@GetMapping("/mentoringCheck")
	public String mentoringCheckMove() {
		System.out.println("멘티 멘토링 관리 | 멘토링 신청 내역 조회 화면");
		return  "member/mentee/mentoringManagement/mentoringCheck";
	}
	
	@GetMapping("/mentoringDetail")
	public String mentoringDetailMove() {
		System.out.println("멘티 멘토링 관리 | 멘토링 신청 내역 조회 화면 | 신청 멘토링 상세 조회");
		return  "member/mentee/mentoringManagement/mentoringCheckDetail";
	}
	
	@GetMapping("/mentoringModify")
	public String mentoringMemoModify() {
		System.out.println("멘티 멘토링 관리 | 메모장 리스트 내역 조회 화면 | 메모장 수정 화면");
		return  "member/mentee/mentoringManagement/mentoringMemo";
	}
	
	@GetMapping("/mentoringMemoList")
	public String mentoringMemoListMove() {
		System.out.println("멘티 멘토링 관리 | 메모장 리스트 내역 조회 화면");
		return  "member/mentee/mentoringManagement/mentoringMemoList";
	}
	
	@GetMapping("/mentoringMemoWrite")
	public String mentoringMemoWriteMove() {
		System.out.println("멘티 멘토링 관리 | 멘토링 신청 내역 조회 화면 | 멘토링 관련 메모 작성 화면");
		return  "member/mentee/mentoringManagement/mentoringMemoWrite";
	}
	
	
}
