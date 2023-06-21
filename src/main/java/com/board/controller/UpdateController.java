package com.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.model.Board;
import com.board.service.BoardService;

@Controller
@RequestMapping("/update")
public class UpdateController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("/{id}")
	public String update(@PathVariable("id") String id, Model model) {
		List<Board> userList = boardService.selectData(id);

		System.out.println("id: " + id);
		System.out.println(userList);
		model.addAttribute("list", userList);
		return "update";
	}
	
	@PostMapping()
	public String updateUser(HttpServletRequest request, Board board) {
		String id = request.getParameter("id");
		System.out.println("id : " + id);
		
		boardService.updateData(board);	
		System.out.println("update");
		
		System.out.println("board : " + board);
		return "redirect:/userList";
	}
}
