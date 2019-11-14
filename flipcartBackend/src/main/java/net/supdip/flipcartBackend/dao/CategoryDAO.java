package net.supdip.flipcartBackend.dao;

import java.util.List;

import net.supdip.flipcartBackend.dto.Category;


public interface CategoryDAO {

	

	public List<Category> list();
	Category get(int id);
	
	
	
}
