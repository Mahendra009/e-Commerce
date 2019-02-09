package com.lko.shopingBackend.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lko.shopingBackend.DAO.UserDAO;
import com.lko.shopingBackend.model.User;

public class UserDAOTest {
	
	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.lko.shopingBackend");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
	}

	
	@Ignore
	@Test
	public void testSaveUser() 
	{
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
		
		assertTrue("Can't save the user detail now", userDAO.saveUser(user));
	}

	@Ignore
	@Test
	public void testUpdateUser() 
	{
		User user = userDAO.getUser("trisul123@gmail.com");
		user.setCity("Prayag Raj");
		
		assertTrue("Can't update user detail.", userDAO.updateUser(user));
	}

	@Ignore
	@Test
	public void testDeleteUser() 
	{
		User user = userDAO.getUser("trisul123@gmail.com");
		
		assertTrue("Can't delete user detail from database.", userDAO.deleteUser(user));
	}

	@Ignore
	@Test
	public void testGetUser()
	{
		System.out.println("Trisul Malviya");
		
		assertNotNull("Unable to get user details.", userDAO.getUser("trisul123@gmail.com"));
	}

	@Ignore
	@Test
	public void testListUsers() 
	{
		List<User> listUsers = userDAO.listUsers();
		assertNotNull("Unable to get the list of users", listUsers.size()>0);
		
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

	@Ignore
	@Test
	public void testValidate() {
		fail("Not yet implemented");
	}

}
