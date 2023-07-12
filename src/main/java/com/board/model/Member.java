package com.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {
	private int memberId;
	private String email;
	private String password;
	private String nickname;
}
