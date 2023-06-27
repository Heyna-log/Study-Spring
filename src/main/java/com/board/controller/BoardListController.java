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
public class BoardListController {
	
	private final BoardService boardService;

	@GetMapping("/boardList")
	public String boardList(Model model) {
		List<Board> boardList = boardService.selectList();
		model.addAttribute("list", boardList);
		return "boardList";
	}

}
