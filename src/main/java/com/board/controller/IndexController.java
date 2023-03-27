package com.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping()
	public String Index(HttpServletRequest request) {
		
		String returnUrl = "index";
		
		request.setAttribute("data", "Hi"); // == model.addAttribute
		
		System.out.println(returnUrl);
		return returnUrl;
	}
	
	@PostMapping("/result")
	public String result(HttpServletRequest request) {
		
		String returnUrl = "result";
		
		String param1 = request.getParameter("value1");
		String param2 = request.getParameter("value2");
		
		request.setAttribute("param1", param1);
		request.setAttribute("param2", param2);
		
		System.out.println(returnUrl);
		return returnUrl;
	}
}
