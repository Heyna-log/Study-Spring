package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping()
	public String Index(Model model) {
		model.addAttribute("data", "Hi");
		
		System.out.println("start");
		return "index";
	}
}
