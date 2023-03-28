package com.board.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Board {
	private String id;
	private String pw;
	private String name;
	private String phone;
}
