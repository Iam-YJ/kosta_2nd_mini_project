package model.dao;

import java.sql.SQLException;
import java.util.List;

import model.dto.Melon;
import model.dto.Noti;
import model.dto.User;

public interface UserDAO {
	/*
	 * īī�� ȸ������ 
	 * */
	int  joinKakao(int userNo, String userNick, int userAge, String userEmail, String userGender);
	
	/*
	 * �α���  
	 * */
	
	
	/*
	 * ���ϱ� �߰�  
	 * */
	int insertBookMark(int userNo, int resNo);
	
	/*
	 * ���ϱ� ����  
	 * */
	int deleteBookMark(int userNo, int resNo);
	
	/*
	 * ���ϱ� ��ȸ
	 */
	List<Melon> selectBookMark(int userNo) throws SQLException;
	
	/*
	 * �����ϴ� �������� ���
	 * */
	//int insertKind();
	
	/*
	 * ����Ʈ ����
	 * */
	int updatePoint(int userNo, int point);
	
	
	/*
	 * ģ�� ���
	 * */
	int insertFriends(int userNo, int friendNo);
	
	/*
	 * ģ�� ����
	 * */
	int deleteFriends(String frId);
	
	/*
	 * ȸ������ ����
	 * */
	int updateUserInfo(User user) throws SQLException;
	
	/*
	 * �������� ����
	 * */
	List<Noti> selectNotice() throws SQLException;
	
	/**
	 * ���ɺо� �߰�
	 */
	int interestInsert(String[] iList) throws SQLException;
}
