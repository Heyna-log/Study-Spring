package com.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.model.Board;
import com.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/view")
public class ViewController {
	
	private final BoardService boardService;

	@GetMapping()
	public String select(Model model, @RequestParam("id") int id) {
		List<Board> userList = boardService.selectData(id);

		System.out.println(userList);
		model.addAttribute("list", userList);
		return "view";
	}
}
