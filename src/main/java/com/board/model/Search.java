package com.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Search extends Pagination{
	
	private String searchType;    // 검색 데이터 기준 - 제목(title) / 내용(content) / 작성자(writer)
	private String keyword;       // 검색 키워드
	
}
