package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.mapper.BoardMapper;
import com.board.model.Board;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	
	private final BoardMapper mapper;
	
	public List<Board> selectList() {
		return mapper.selectList();
	}
	
	public List<Board> selectData(String id) {
		return mapper.selectData(id);
	}
	
	public void insertData(Board board) {
		mapper.insertData(board);
	}
	
	public void updateData(Board board) {
		mapper.updateData(board);
		System.out.println("update");
	}
	
	public void deleteData(String id) {
		mapper.deleteData(id);
	}
}
