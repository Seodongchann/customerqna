package kr.co.greenart.web;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//이것이 MyBatis다 
@Mapper
public interface customerQnaMapper {
	@Insert("insert into customerqna(article_id, title, username, is_secure) values article_id = #{id}, title = #{title}, username = #{username}, is_secure #{is_secure} ")
	customerQna a(int id, String title, String username, int is_secure);
	
	@Select("select article_id, title, username, is_secure from customerqna")
	customerQna b(int article_id, String title, String username, int is_secure); 

	@Select("select article_id, title, username, is_secure from customerqna where article_id = 1")
	customerQna c(int article_id, String title, String username, int is_secure); 

}
