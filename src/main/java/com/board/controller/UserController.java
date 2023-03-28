package com.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.board.model.Board;
import com.board.service.BoardService;

@Controller
public class UserController {
	
	@Autowired
	private BoardService boardService;

	@GetMapping("/userList")
	public String userList(Model model) {
		List<Board> userList = boardService.selectList();
		model.addAttribute("list", userList);
		return "userList";
	}
}
