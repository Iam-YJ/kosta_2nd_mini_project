package model.service;

import java.sql.SQLException;
import java.util.List;

import model.dao.UserDAO;
import model.dao.UserDAOImpl;
import model.dto.Melon;

public class UserService {
	
	UserDAO dao = new UserDAOImpl();
	
	/**
	 * 찜하기 추가 
	 */
	public int insertBookMark(int userNo, int resNo) {
		
		int result = dao.insertBookMark(userNo, resNo);
		return result;
	}
	
	/**
	 * 찜하기 삭제
	 */
	public int deleteBookMark(int userNo, int resNo) {
		
		int result = dao.deleteBookMark(userNo, resNo);
		return result;
	}
	
	/**
	 * 찜하기 조회
	 */
	public List<Melon> selectBookMark(int userNo) throws SQLException {
		
		List<Melon> list = dao.selectBookMark(userNo);
		return list;
	}
	
	/**
	 * 포인트 증가
	 */
	public int updatePoint(int userNo, int point) {
		
		int result = dao.updatePoint(userNo, point);
		return result;
	}

}
