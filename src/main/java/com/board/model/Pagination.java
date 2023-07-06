package com.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pagination {
	
	private int listSize = 5;   // 한 페이지에서 보여질 게시글의 개수 
	private int rangeSize = 10; // 한 페이지 범위의 개수
	
	private int page;           // 현재 페이지
	private int range;          // 현재 페이지 범위 / ex. range=3 -> page 21~30
	
	private int listCnt;        // 전체 게시물 개수
	private int pageCnt;        // 전체 페이지 개수
	
	private int startPage;      // 각 페이지 범위 시작 번호
	private int endPage;        // 각 페이지 범위 끝 번호
	
	private int startList;      // 게시글 목록 시작 번호
	
	private boolean prev;       // 이전 페이지 여부
	private boolean next;       // 다음 페이지 여부
	

	public void pageInfo(int page, int range, int listCnt) {
		
		this.page = page;
		this.range = range;
		this.listCnt = listCnt;
		
		// 전체 페이지 수 
		this.pageCnt = (int) Math.ceil((double) listCnt/listSize);
		
		// 시작 페이지
		this.startPage = ((range - 1) * rangeSize) + 1;
		
		// 끝 페이지
		this.endPage = range * rangeSize;
				
		// 게시판 시작번호
		// 1을 더하지 않는 이유 -> sql limit문 규칙 때문 
		// LIMIT 첫번째 row 위치, 읽어올 갯수
		// 1번째 게시글부터 10개를 가져오기 -> LIMIT 0, 10
		this.startList = (page - 1) * listSize;

		// 이전 버튼 상태
		this.prev = range == 1 ? false : true;

		// 다음 버튼 상태
		// 현재 페이지 범위 끝 번호가 전체 페이지 개수보다 크거나 같을 때 
		this.next = endPage >= pageCnt ? false : true;
		
		// 현재 페이지 범위 끝 번호가 전체 페이지 개수보다 클 때
		if (endPage > pageCnt) {
			this.endPage = this.pageCnt;
		}
	}
}
