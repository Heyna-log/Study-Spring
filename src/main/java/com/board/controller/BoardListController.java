package com.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.model.Board;
import com.board.model.Search;
import com.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardListController {
	
	private final BoardService boardService;

	@GetMapping("/boardList")
	public String getBoardList(Model model, 
			@RequestParam(defaultValue = "1") int page, 
			@RequestParam(defaultValue = "1") int range,
			@RequestParam(defaultValue = "title") String searchType,
			@RequestParam(required = false) String keyword) {
		
		// Search
		Search search = new Search();
		search.setSearchType(searchType);
		search.setKeyword(keyword);
		
		// 전체 게시글 개수
		int listCnt = boardService.getBoardListCount(search);
		
		// Pagination
		search.pageInfo(page, range, listCnt);
		
		// 게시글 리스트
		List<Board> boardList = boardService.selectList(search);
		
		model.addAttribute("pagination", search);
		model.addAttribute("boardList", boardList);
		
		return "boardList";
	}
}
