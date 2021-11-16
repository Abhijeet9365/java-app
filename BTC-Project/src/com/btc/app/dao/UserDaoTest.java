package com.btc.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.btc.app.model.User;

class UserDaoImplTest {

	//@Test
UserDao dao=new UserDaoImpl();
	
	
	@Test
	void testAddUser() throws Exception {
		User user=new User(1006,"Uttam Reddy","Utha123","crime");
		assertEquals(user, dao.addUser(user));
	}
}