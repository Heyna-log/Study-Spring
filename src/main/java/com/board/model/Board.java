package com.board.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Board {
	private int id;
	private String title;
	private String writer;
	private String content;
	private Timestamp regDate;
	private Timestamp updateDate;
}
