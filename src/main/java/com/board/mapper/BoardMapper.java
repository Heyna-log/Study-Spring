package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.model.Board;

@Mapper
public interface BoardMapper {

	public List<Board> selectList();
	
	public Board selectData(int id);
	
	public void insertData(Board board);
	
	public void updateData(Board board);
	
	public void deleteData(int id);
}
