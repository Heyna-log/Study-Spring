package com.board.controller;

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
	public String Index(Model model) {
		
		String returnUrl = "index";
		
		model.addAttribute("data", "Hi");
		
		System.out.println(returnUrl);
		return returnUrl;
	}
	
	@PostMapping("/result")
	public String result(Model model, 
			@RequestParam("value1") String val1,
			@RequestParam("value2") String val2) {
		
		String returnUrl = "result";
		
		model.addAttribute("param1", val1);
		model.addAttribute("param2", val2);
		
		System.out.println(returnUrl);
		return returnUrl;
	}
}
