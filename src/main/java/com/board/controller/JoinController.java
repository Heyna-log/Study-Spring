package com.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.model.Board;
import com.board.service.BoardService;

@Controller
@RequestMapping("/join")
public class JoinController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping()
	public String join() {
		return "join";
	}
	
	@PostMapping()
	public String joinUser(Board board) {
		boardService.insertData(board);
		
		return "redirect:/userList";
	}

}
