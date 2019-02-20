package com.lko.shopingBackend.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lko.shopingBackend.DAO.CategoryDAO;
import com.lko.shopingBackend.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveCategory(Category category) {
		try
		{
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateCategory(Category category) {
		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteCategory(Category category) {
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Category getCategory(int categoryId) {
		try
		{
			Session session = sessionFactory.getCurrentSession();
			Category category = session.get(Category.class, categoryId);
			return category;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Category> listCategories() {
		try
		{
			Session session = sessionFactory.getCurrentSession();
			@SuppressWarnings("unchecked")
			Query<Category> query = session.createQuery("from Category");
			List<Category> listCategories = query.list();
			return listCategories;
		}
		catch(Exception e)
		{
			return null;
		}
	}

}
