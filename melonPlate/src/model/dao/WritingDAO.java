package model.dao;

import java.sql.SQLException;
import java.util.List;

import model.dto.Melon;
import model.dto.WriList;
import model.dto.Writing;

public interface WritingDAO {
	
	/**
	 * �Ĵ��̸����� �˻� 
	 */
	List<Melon> selectByName(String resName) throws SQLException;
	
	/*
	 * �� ���
	 * */
	int insertWriting(Writing writing) throws SQLException;
	
	/*
	 * �� ����
	 * */
	int deleteWriting(int wriNo);
	
	/*
	 * �� ����
	 * */
	int updateWriting(Writing writing) throws SQLException;
	
	/*
	 * �� ��ü����
	 * */
	List<Writing> selectWriting() throws SQLException;
}
