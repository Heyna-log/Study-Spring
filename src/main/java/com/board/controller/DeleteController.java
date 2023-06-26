package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/delete")
public class DeleteController {

	private final BoardService boardService;
	
	@GetMapping("/{id}")
	public String deleteUser(@PathVariable("id") String id) {
		boardService.deleteData(id);
		System.out.println("delete");
		
		return "redirect:/userList";
	}
}
