package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.mapper.BoardMapper;
import com.board.model.Board;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	public List<Board> selectList() {
		return mapper.selectList();
	}
}
