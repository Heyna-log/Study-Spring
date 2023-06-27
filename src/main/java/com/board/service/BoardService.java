package com.board.service;

import java.util.List;

import com.board.model.Board;

public interface BoardService {
	
	public List<Board> selectList();
	
	public List<Board> selectData(int id);
	
	public void insertData(Board board);
	
	public void updateData(Board board);
	
	public void deleteData(int id);
}
