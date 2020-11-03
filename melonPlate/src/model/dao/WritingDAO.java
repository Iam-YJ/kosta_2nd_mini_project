package model.dao;

import java.util.List;

import model.dto.Writing;

public interface WritingDAO {
	/*
	 * �� ���
	 * */
	int insertInfo(Writing w);
	
	/*
	 * �� ����
	 * */
	int deleteWriting(int wriNo);
	
	/*
	 * �� ����
	 * */
	int updateWriting(Writing w);
	
	/*
	 * �� ��ü����
	 * */
	List<Writing> selectWriting();
}
