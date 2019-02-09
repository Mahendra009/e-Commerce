package com.lko.shopingBackend.DAO;

import java.util.List;

import com.lko.shopingBackend.model.User;

public interface UserDAO {
	
	public boolean saveUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public User getUser(String emailId);
	public List<User> listUsers();
	public User validate(String emailId,String password);

}
