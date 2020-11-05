package model.service;

import java.sql.SQLException;
import java.util.List;

import model.dao.UserDAO;
import model.dao.UserDAOImpl;
import model.dto.Melon;

public class UserService {
	
	UserDAO dao = new UserDAOImpl();
	
	/**
	 * ���ϱ� �߰� 
	 */
	public int insertBookMark(int userNo, int resNo) {
		
		int result = dao.insertBookMark(userNo, resNo);
		return result;
	}
	
	/**
	 * ���ϱ� ����
	 */
	public int deleteBookMark(int userNo, int resNo) {
		
		int result = dao.deleteBookMark(userNo, resNo);
		return result;
	}
	
	/**
	 * ���ϱ� ��ȸ
	 */
	public List<Melon> selectBookMark(int userNo) throws SQLException {
		
		List<Melon> list = dao.selectBookMark(userNo);
		return list;
	}
	
	/**
	 * ����Ʈ ����
	 */
	public int updatePoint(int userNo, int point) {
		
		int result = dao.updatePoint(userNo, point);
		return result;
	}

}
