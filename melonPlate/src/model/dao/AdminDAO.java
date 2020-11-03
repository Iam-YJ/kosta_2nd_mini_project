package model.dao;

import model.dto.Melon;
import model.dto.Noti;

public interface AdminDAO {
	/*
	 * ���� ���
	 * */
	int insertRes(Melon melon);
	
	/*
	 * ���� ����
	 * */
	int deleteRes(int resNo);
	
	/*
	 * ���� ����
	 * */
	int updateRes(Melon melon);
	
	/*
	 * ȸ�� ��� ����
	 * */
	void manageUserGrade(String userId, String grade);
	
	/*
	 * �������� �ۼ�
	 * */
	int insertNotice(Noti notice);
	
	/*
	 * �������� ����
	 * */
	int updateNotice(Noti notice);
	
	/*
	 * �������� ����
	 * */
	int deleteNotice(int notiNo);
	
	/*
	 * ȸ�� �߹�
	 * */
	
	int banUser(String userId);
	
}
