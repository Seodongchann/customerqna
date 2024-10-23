package kr.co.greenart.web;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class customerQna {
	private int article_id;
	private String title;
	private String content;
	private String username;
	private String password;
	private int views;
	private int is_secure;
	private int is_deleted;
	
	
}
