package model.service;

import java.sql.SQLException;
import java.util.List;

import model.dao.WritingDAO;
import model.dao.WritingDAOImpl;
import model.dto.Melon;

public class WritingService {
	
	WritingDAO dao = new WritingDAOImpl();
	
	/**
	 * �Ĵ� �̸����� �˻�
	 */
	public List<Melon> selectByName(String resName) throws SQLException{
		List<Melon> list = dao.selectByName(resName);
		return list;
	}
	
	/**
	 * 
	 */

}
