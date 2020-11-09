package model.dao;

import java.sql.SQLException;
import java.util.List;

import model.dto.Melon;
import model.dto.Reply;

public interface ReplyDAO {
	/*
	 * �Ĵ縮�� �ۼ�
	 * */
	int insertReply(Reply reply)throws SQLException;
	
	
	/*
	 * �Ĵ縮�� ����
	 * */
	int deleteReply(int resNo, int userNo) throws SQLException;
	
	
	/*
	 * �Ĵ縮�� ����
	 * */
	int updateReply(Reply reply)throws SQLException;
	
	
	/*
	 * ���� ��ü ���� - �Ĵ纰
	 * */
	List<Reply> selectReplyByResNo(int resNo)throws SQLException;
	
	/*
	 * ���� ��ü ���� - ����������
	 * */
	List<Reply> selectReplyByUserNo(int userNo)throws SQLException;
	
	/*
	 * ������ ����
	 * */
	int incrementLike(int res_no, int user_no)throws SQLException;
	
	/**
	 * �Ĵ��ȣ�� �Ĵ� �˻�
	 */
	Melon selectByResNo(int resNo);

	/**
	 * �Ĵ��ȣ, ������ȣ�� ���� �˻� 
	 */
	Reply selectReplyByResNoAndUserNo(int resNo, int userNo) throws SQLException;
	
}
