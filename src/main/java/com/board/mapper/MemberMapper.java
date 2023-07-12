package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.model.Member;

@Mapper
public interface MemberMapper {
	
	public int save(Member member);
	
	public List<Member> selectMemberList();
}
