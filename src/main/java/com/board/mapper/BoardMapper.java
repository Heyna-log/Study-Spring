package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.model.Board;
import com.board.model.Pagination;

@Mapper
public interface BoardMapper {

	public List<Board> selectList(Pagination pagination);
	
	public int getBoardListCount();  // 총 게시글 개수
	
	public Board selectData(int id);
	
	public void insertData(Board board);
	
	public void updateData(Board board);
	
	public void deleteData(int id);
}
