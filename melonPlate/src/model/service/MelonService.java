package model.service;

import model.dao.UserDAO;
import model.dao.UserDAOImpl;

public class MelonService {

	public void insert() {
		UserDAO dao = new UserDAOImpl();
		
		int result = dao.insertBookMark(1, 2);
		
		System.out.println("result = " + result);

	}
}
