package com.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping()
	public ModelAndView Index() {
		
		String returnUrl = "index";
		
		// 생성자 메소드
		// ModelAndView(String viewName, String name, Object value);
		ModelAndView mv = new ModelAndView(returnUrl, "data", "Hi");
		
		System.out.println(returnUrl);
		
		// ModelAndView 객체 반환
		return mv;
	}
	
	@PostMapping("/result")
	public ModelAndView result(HttpServletRequest request) {
		
		String returnUrl = "result";
		
		String param1 = request.getParameter("value1");
		String param2 = request.getParameter("value2");
		
		// ModelAndView 객체 선언 및 생성
		ModelAndView mv = new ModelAndView();
		
		request.setAttribute("param1", param1);
		request.setAttribute("param2", param2);
		
		// view의 이름 설정
		mv.setViewName(returnUrl);
		
		// 데이터 저장(데이터이름, 데이터)
		mv.addObject("param1", param1);
		mv.addObject("param2", param2);
		
		System.out.println(returnUrl);
		
		// ModelAndView 객체 반환
		return mv;
	}
}
