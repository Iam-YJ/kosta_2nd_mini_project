package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.dto.Melon;
import model.dto.Noti;
import util.DbUtil;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public int insertRes(Melon melon) throws SQLException {

		return 0;
	}

	@Override
	public int deleteRes(int resNo) throws SQLException {

		return 0;
	}

	@Override
	public int updateRes(Melon melon) throws SQLException {

		return 0;
	}

	@Override
	public void manageUserGrade(String userId, String grade) throws SQLException {
		//�������� ���� ���� �������� ��� ��� �� 
		//���� ���� �����ϱ�

	}

	@Override
	public int insertNotice(Noti notice) throws SQLException {
		// �ε� ���� ���� �ݱ�
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("insert into NOTICE " + "values(NOTI_NO_SEQ.nextval,?,?,sysdate,?,?)");
			// ��������no ����no ������������ ���������ۼ���¥ �������׳��� ����������ȸ��
			ps.setInt(1, notice.getUserNo());
			ps.setString(2, notice.getNotiTitle());
			ps.setString(3, notice.getNotiContent());
			ps.setInt(4, notice.getNotiHits());

			result = ps.executeUpdate();

			// ���� ����
		} finally {
			// �ݱ�
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

	@Override
	public int updateNotice(Noti notice) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("update NOTICE set " + "NOTI_TITLE=?, NOTI_CONTENT=?");
			// ��������no ����no ������������ ���������ۼ���¥ �������׳��� ����������ȸ��
			ps.setString(1, notice.getNotiTitle());
			ps.setString(2, notice.getNotiContent());

			result = ps.executeUpdate();

			// ���� ����
		} finally {
			// �ݱ�
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

	@Override
	public int deleteNotice(int notiNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("delete from NOTICE where NOTI_NO = ?");
			// ��������no ����no ������������ ���������ۼ���¥ �������׳��� ����������ȸ��
			ps.setInt(1, notiNo);

			result = ps.executeUpdate();

			// ���� ����
		} finally {
			// �ݱ�
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

	
	@Override
	public int banUser(String userId) throws SQLException {
		//�������� ����� �ҷ����� ��� ����ؼ� ã�� �� 
		// �� ������ ���� ����
		return 0;
	}

}
