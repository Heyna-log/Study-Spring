package com.board.pagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.annotation.Rollback;

import com.board.mapper.BoardMapper;
import com.board.model.Board;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;

@MybatisTest // Mybatis 컴포넌트를 테스트 하기 위해 사용(Mapper interface, sqlSession 등) 
@AutoConfigureTestDatabase(replace = Replace.NONE)	// 현재 연결된 실제DB로 테스트함을 의미
@Rollback(value = false)							// 테스트시 롤백 안함
public class CreateSampleDataTest {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	@DisplayName("샘플 데이터 100개 생성")
	public void insertSampleData() {
		
		Board board = new Board();
		
		for (int i = 1; i <= 100; i++) {
			board.setId("test"+i);
			board.setPw("test"+i);
			board.setName("test"+i);
			board.setPhone("010-test"+i);
			mapper.insertData(board);
		}
		
		Assertions.assertThat(mapper.selectData("test100").get(0).getName()).isEqualTo("test100");
	}
}
