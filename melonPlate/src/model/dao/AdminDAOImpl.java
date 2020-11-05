package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.PresentationDirection;

import model.dto.Melon;
import model.dto.Noti;
import util.DbUtil;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public int insertRes(Melon melon) throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("insert into restaurant values(RES_NO_SEQ.nextval,?,?,?,?,?,?,?,?");
			ps.setString(1, melon.getResName());
			ps.setString(2, melon.getResPlace());
			ps.setString(3, melon.getResTel());
			ps.setString(4, melon.getResType());
			ps.setString(5, melon.getResPhoto());
			ps.setInt(6, melon.getResHits());
			ps.setDouble(7, melon.getResGrade());
			ps.setString(8, melon.getResPrice());

			result = ps.executeUpdate();
		} finally {

			DbUtil.dbClose(ps, con);
		}

		return result;

	}

	@Override
	public int deleteRes(int resNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("delete from restaurant where RES_NO =?");

			ps.setInt(1, resNo);

			result = ps.executeUpdate();

		} finally {

			DbUtil.dbClose(ps, con);

		}
		return result;
	}

	@Override
	public int updateRes(Melon melon) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {

			con = DbUtil.getConnection();
			ps = con.prepareStatement(
					"update restaurant set RES_NAME=?, RES_PLACE=?, RES_TEL=?, RES_TYPE=?, RES_PHOTO=?, RES_GRADE=?, RES_PRICE=? where RES_NUM=?");

			ps.setString(1, melon.getResName());
			ps.setString(2, melon.getResPlace());
			ps.setString(3, melon.getResTel());
			ps.setString(4, melon.getResType());
			ps.setString(5, melon.getResPhoto());
			ps.setDouble(6, melon.getResGrade());
			ps.setString(7, melon.getResPrice());
			ps.setInt(8, melon.getResNo());

			result = ps.executeUpdate();
		} finally {

			DbUtil.dbClose(ps, con);
		}

		return result;
	}

	@Override
	public void manageUserGrade(String userId, String grade) throws SQLException {
		// �������� ���� ���� �������� ��� ��� ��
		// ���� ���� �����ϱ�

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
		// �������� ����� �ҷ����� ��� ����ؼ� ã�� ��
		// �� ������ ���� ����
		return 0;
	}

	@Override
	public List<Noti> selectNoti() throws SQLException {
		List<Noti> list = new ArrayList<Noti>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM NOTICE";

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {

				int notiNo = rs.getInt(1);
				int userNo = rs.getInt(2);
				String notiTitle = rs.getString(3);
				String notiDate = rs.getString(4);
				String notiContent = rs.getString(5);
				int notiHits = rs.getInt(6);

				Noti noti = new Noti(notiNo, userNo, notiTitle, notiDate, notiContent, notiHits);
				list.add(noti);
			}

		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}

}