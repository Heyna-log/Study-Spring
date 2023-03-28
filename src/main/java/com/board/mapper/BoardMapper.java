package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.model.Board;

@Mapper
public interface BoardMapper {

	List<Board> selectList();
	
}
