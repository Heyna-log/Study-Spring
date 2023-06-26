package com.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.board.model.Board;
import com.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	
	private final BoardService boardService;

	@GetMapping("/userList")
	public String userList(Model model) {
		List<Board> userList = boardService.selectList();
		model.addAttribute("list", userList);
		return "userList";
	}

}
