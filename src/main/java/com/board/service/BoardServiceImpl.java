package com.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.board.mapper.BoardMapper;
import com.board.model.Board;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private final BoardMapper mapper;
	
	@Override
	public List<Board> selectList() {
		return mapper.selectList();
	}
	
	@Override
	public Board selectData(int id) {
		return mapper.selectData(id);
	}
	
	@Override
	public void insertData(Board board) {
		mapper.insertData(board);
	}
	
	@Override
	public void updateData(Board board) {
		mapper.updateData(board);
	}
	
	@Override
	public void deleteData(int id) {
		mapper.deleteData(id);
	}
}
