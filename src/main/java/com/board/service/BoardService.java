package com.board.service;

import java.util.List;

import com.board.model.Board;
import com.board.model.Pagination;

public interface BoardService {
	
	public List<Board> selectList(Pagination pagination);
	
	public int getBoardListCount();
	
	public Board selectData(int id);
	
	public void insertData(Board board);
	
	public void updateData(Board board);
	
	public void deleteData(int id);
}
