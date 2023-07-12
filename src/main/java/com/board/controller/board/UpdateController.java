package com.board.controller.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.model.Board;
import com.board.service.board.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/update")
public class UpdateController {

	private final BoardService boardService;
	
	@GetMapping("/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		Board post = boardService.selectData(id);

		System.out.println("id: " + id);
		model.addAttribute("post", post);
		return "update";
	}
	
	@PostMapping()
	public String updatePost(HttpServletRequest request, Board board) {
		String id = request.getParameter("id");
		System.out.println("id : " + id);
		
		boardService.updateData(board);	
		System.out.println("update");
		
		System.out.println("board : " + board);
		return "redirect:/boardList";
	}
}
