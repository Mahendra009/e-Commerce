package com.lko.shopingBackend.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lko.shopingBackend.DAO.UserDAO;
import com.lko.shopingBackend.model.User;

class UserDAOTest {
	
	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.lko.shopingBackend");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
	}

	@Disabled
	@Test
	void testSaveUser() {
		User user = new User();
		user.setAddress("Ganesh Gunj");
		user.setCity("Lucknow");
		user.setContactNumber("2222222222");
		user.setCountry("India");
		user.setEmailId("trisul123@gmail.com");
		user.setEnabled(true);
		user.setPassword("trisul1234");
		user.setRole("User");
		user.setUserName("Trisul Malviya");
		
		assertNotNull(userDAO.saveUser(user), "Cant save user detail now");
	}

	@Disabled
	@Test
	void testUpdateUser() {
		User user = userDAO.getUser("sattu123@gmail.com");
		user.setAddress("Rajendra Nagar");
		
		assertNotNull(userDAO.updateUser(user), "Cant update user detail now");
	}

	@Disabled
	@Test
	void testDeleteUser() {
		User user = userDAO.getUser("trisul123@gmail.com");
		
		assertNotNull(userDAO.deleteUser(user), "Cant delete user detail now");
	}

	@Disabled
	@Test
	void testGetUser() {
		System.out.println("Satveer Singh Saini");
		
		assertNotNull(userDAO.getUser("sattu123@gmail.com"), "Cant get user detail now");
		
		
	}

	@Disabled
	@Test
	void testListUsers() {
		List<User> listUsers = userDAO.listUsers();
		assertTrue(userDAO.listUsers().size()>0, "Unable to get all users list");
		
		for(User user : listUsers)
		{
			System.out.println(user.getUserName() + ":::");
			System.out.print(user.getRole() + ":::");
			System.out.print(user.getAddress() + ":::");
			System.out.print(user.getCity() + ":::");
			System.out.print(user.getContactNumber() + ":::");
			System.out.print(user.getCountry() + ":::");
			System.out.print(user.getEmailId() + ":::");
			System.out.print(user.getPassword() + ":::");
			
			
		}
	}

	@Disabled
	@Test
	void testValidate() {
		fail("Not yet implemented");
	}

}
