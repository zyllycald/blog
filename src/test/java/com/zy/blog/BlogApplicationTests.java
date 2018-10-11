package com.zy.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zy.blog.entity.User;
import com.zy.blog.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {
	@Autowired
	private UserMapper studentMapper;
	
	
	@Test
	public void contextLoads() {
		User stu = studentMapper.findByName("张海洋");
		System.out.println(stu.getPassword());
	}

}
