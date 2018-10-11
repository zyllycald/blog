/**
 * 
 */
package com.zy.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zy.blog.entity.User;



/**
 * @author zhouyu
 * 2018/10/11  05:53
 * Describe: 用户Mapper（访问数据库）
 */
@Mapper
public interface UserMapper {
	@Select("SELECT * FROM USER WHERE USERNAME = #{name}")
	public User findByName(@Param("name") String name);
}
