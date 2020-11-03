package model.dao;

import java.util.List;

import model.dto.Noti;
import model.dto.User;

public interface UserDAO {
	/*
	 * ȸ������ 
	 * */
	int  join(User user);
	
	/*
	 * �α���  
	 * */
	
	
	/*
	 * ���ϱ� �߰�  
	 * */
	int insertBookMark(int resNo);
	
	/*
	 * ���ϱ� ����  
	 * */
	int deleteBookMark(int resNo);
	
	/*
	 * �����ϴ� �������� ���
	 * */
	//int insertKind();
	
	/*
	 * ����Ʈ ����
	 * */
	int updatePoint(String userId, int point);
	
	
	/*
	 * ģ�� ���
	 * */
	int insertFriends(String userId, String frId);
	
	/*
	 * ģ�� ����
	 * */
	int deleteFriends(String frId);
	
	/*
	 * ȸ������ ����
	 * */
	int updateUserInfo(User user);
	
	/*
	 * �������� ����
	 * */
	List<Noti> selectNotice();
}
