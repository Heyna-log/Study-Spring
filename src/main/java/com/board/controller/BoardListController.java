package com.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.model.Board;
import com.board.model.Pagination;
import com.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardListController {
	
	private final BoardService boardService;

	@GetMapping("/boardList")
	public String getBoardList(Model model, 
			@RequestParam(required = false, defaultValue = "1") int page, 
			@RequestParam(required = false, defaultValue = "1") int range) {
		
		// 전체 게시글 개수
		int listCnt = boardService.getBoardListCount();

		// pagination 객체 생성
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		
		// 게시글 리스트
		List<Board> boardList = boardService.selectList(pagination);
		
		model.addAttribute("pagination", pagination);
		model.addAttribute("boardList", boardList);
		
		return "boardList";
	}

}
