package model.dao;

import java.util.List;

import model.dto.Reply;

public interface ReplyDAO {
	/*
	 * ���� �ۼ�
	 * */
	int insertReply(Reply reply);
	
	/*
	 * ���� ����
	 * */
	int deleteReply(int replNo);
	
	/*
	 * ���� ����
	 * */
	int updateReply(Reply reply);
	
	/*
	 * ���� ��ü ����
	 * */
	List<Reply> selectReply();
	
	/*
	 * ������ ����
	 * */
	int incrementLike(int replNo);
}
