package com.ywa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ywa.domain.User;
import com.ywa.repository.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
public class UserDaoImplTest {
	
	@Autowired
	UserDao userDao;
	
	@Test
	public void testInsert() {
		User user = new User();
		user.setEmail("y@mail.com");
		userDao.insertUser(user);
	}
	
	public static void main(String[] args) {
		String email = "y@mail.com";
		System.out.println(email.length());
	}
}