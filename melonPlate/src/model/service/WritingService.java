package model.service;

import java.sql.SQLException;
import java.util.List;

import model.dao.WritingDAO;
import model.dao.WritingDAOImpl;
import model.dto.Melon;
import model.dto.Writing;

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
	 * �� �ۼ� 
	 */
	public void insertWriting(Writing writing) throws SQLException{
		System.out.println("WritingService�� insertWriting() �޼ҵ�");
		int result = dao.insertWriting(writing);
		if(result==0) throw new SQLException("�� �ۼ� ����");
	}
	
	/**
	 * �� ���� 
	 */
	public void updateWriting(Writing writing) throws SQLException{
		int result = dao.updateWriting(writing);
		if(result==0) throw new SQLException("�� ���� ����");
	}
	
	/**
	 * �� ����
	 */
	public void deleteWriting(int wriNo) throws SQLException{
		System.out.println("WritingService�� deleteWriting() �޼ҵ�");
		int result = dao.deleteWriting(wriNo);
		if(result==0) throw new SQLException("�� ���� ����");
		System.out.println("result: " + result);
	}
	
	/**
	 * �� ��ȸ 
	 */
	public List<Writing> selectWriting() throws SQLException{
		List<Writing> list = dao.selectWriting();
		if(list==null || list.size()==0) throw new SQLException("�� ����");
		return list;
	}

}
