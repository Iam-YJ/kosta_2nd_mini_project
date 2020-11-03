package model.dao;

import model.dto.Melon;
import model.dto.Noti;

public interface AdminDAO {
	/*
	 * 맛집 등록
	 * */
	int insertRes(Melon melon);
	
	/*
	 * 맛집 삭제
	 * */
	int deleteRes(int resNo);
	
	/*
	 * 맛집 수정
	 * */
	int updateRes(Melon melon);
	
	/*
	 * 회원 등급 관리
	 * */
	void manageUserGrade(String userId, String grade);
	
	/*
	 * 공지사항 작성
	 * */
	int insertNotice(Noti notice);
	
	/*
	 * 공지사항 수정
	 * */
	int updateNotice(Noti notice);
	
	/*
	 * 공지사항 삭제
	 * */
	int deleteNotice(int notiNo);
	
	/*
	 * 회원 추방
	 * */
	
	int banUser(String userId);
	
}
