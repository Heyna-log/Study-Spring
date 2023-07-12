package com.board.controller.member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.model.Member;
import com.board.service.member.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/joinForm")
public class JoinController {

	private final MemberService memberService;
	
	@GetMapping()
	public String joinForm() {
		return "joinForm";
	}
	
	@PostMapping("/join")
	public String joinMember(Member member) {
		
		//// 이메일 중복 체크
		// 입력한 이메일값
		String email = member.getEmail();
		
		// DB에서 member 데이터 가져오기
		List<Member> emails = memberService.selectMemberList();
		
		// email 필드에서 입력한 이메일값과 같은 데이터만 리스트로 만들기
		List<Member> emailList = emails.stream().filter(e -> e.getEmail().equals(email)).collect(Collectors.toList());
		System.out.println("emailList: " + emailList);
		
		// 리스트 사이즈가 0이 아니면 같은 데이터(중복 이메일)이 있다는 의미
		if (emailList.size() != 0) {
			System.out.println("Email Duplicate");
			return "redirect:/joinForm";
		} else {
			int result = memberService.save(member); 
			System.out.println("result: "+ result);
			return "redirect:/loginForm";			
		}
	}
}
