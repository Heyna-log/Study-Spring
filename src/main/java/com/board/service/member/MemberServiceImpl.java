package com.board.service.member;

import java.util.List;

import org.springframework.stereotype.Service;

import com.board.mapper.MemberMapper;
import com.board.model.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	
	private final MemberMapper mapper;

	@Override
	public int save(Member member) {
		return mapper.save(member);
	}
	
	@Override
	public List<Member> selectMemberList() {
		return mapper.selectMemberList();
	};
}
