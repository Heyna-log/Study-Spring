package com.board.service.board;

import java.util.List;

import com.board.model.Board;
import com.board.model.Search;

public interface BoardService {
	
	public List<Board> selectList(Search search);
	
	public int getBoardListCount(Search search);
	
	public Board selectData(int id);
	
	public void insertData(Board board);
	
	public void updateData(Board board);
	
	public void deleteData(int id);
}
