package com.board.service.member;

import java.util.List;

import com.board.model.Member;

public interface MemberService {
	
	public int save(Member member);
	
	public List<Member> selectMemberList();
}
