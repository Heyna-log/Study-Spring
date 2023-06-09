package com.board.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.model.Board;
import com.board.service.board.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/create")
public class CreateController {
	
	private final BoardService boardService;
	
	@GetMapping()
	public String create() {
		return "create";
	}
	
	@PostMapping()
	public String createPost(Board board) {
		boardService.insertData(board);
		
		return "redirect:/boardList";
	}

}
