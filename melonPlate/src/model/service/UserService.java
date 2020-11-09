package model.service;

import java.sql.SQLException;
import java.util.List;

import model.dao.UserDAO;
import model.dao.UserDAOImpl;
import model.dto.Melon;
import model.dto.Noti;
import model.dto.User;

public class UserService {

	UserDAO dao = new UserDAOImpl();

	/**
	 * �����ϱ�
	 */

	public int joinKakao(int userNo, String userNick, int userAge, String userEmail, String userGender) {
		int result = dao.joinKakao(userNo, userNick, userAge, userEmail, userGender);
		return result;

	}

	/**
	 * ���ϱ� �߰�
	 */
	public int insertBookMark(int userNo, int resNo) {

		int result = dao.insertBookMark(userNo, resNo);
		return result;
	}

	/**
	 * ���ϱ� ����
	 */
	public int deleteBookMark(int userNo, int resNo) {

		int result = dao.deleteBookMark(userNo, resNo);
		return result;
	}

	/**
	 * ���ϱ� ��ȸ
	 */
	public List<Melon> selectBookMark(int userNo) throws SQLException {

		List<Melon> list = dao.selectBookMark(userNo);
		return list;
	}

	/**
	 * ����Ʈ ����
	 */
	public int updatePoint(int userNo, int point) {

		int result = dao.updatePoint(userNo, point);
		return result;
	}

	/**
	 * ȸ������ ����
	 */
	public int updateUserInfo(User user) throws SQLException {

		int result = dao.updateUserInfo(user);
		if (result == 0)
			throw new SQLException("�������� �ʾҽ��ϴ�.");
		return result;
	}

	/**
	 * �������� ��ȸ
	 */

	public List<Noti> selectNotice() throws SQLException {
		List<Noti> list = dao.selectNotice();
		if (list.size() == 0)
			throw new SQLException("�˻���� �����ϴ�.");
		return list;

	}

	public int interestInsert(String[] iList) throws SQLException{
		int result = dao.interestInsert(iList);
		if (result == 0)
			throw new SQLException("���ɺо߰� ���õ��� �ʾҽ��ϴ�.");
		return result;
	}

}
