package model.dao;

import java.sql.SQLException;
import java.util.List;

import model.dto.Melon;

public interface MelonDAO {
	/*
	 * ��ȸ�� ������ �˻�(��������)
	 * */
	List<Melon> selectByHits(int hits);
	
	/*
	 * ���������� �˻� (���� ��������)
	 * */
	List<Melon> selectByGrade(double grade);
	
	/*
	 * ���������� �˻� (����)
	 * */
	List<Melon> selectByType(String type);
	
	/*
	 * ��ȸ�� ���� (����no)
	 * */
	int updateHits(int resNo);
	
	/*
	 * ������ �˻� (����)
	 * */
	List<Melon> selectByArea(String area);

}
