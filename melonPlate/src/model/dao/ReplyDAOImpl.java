package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dto.Reply;
import util.DbUtil;

public class ReplyDAOImpl implements ReplyDAO {
	/*
	 * ���� �ۼ� -�Ĵ纰
	 */
	@Override
	public int insertReply(Reply reply) throws SQLException {
		System.out.println("dao");
		Connection con = DbUtil.getConnection();
		PreparedStatement ps = null;
		int result = 0;
		String sql = "INSERT INTO REVIEW VALUES(REVIEW_NO_SEQ.NEXTVAL,?,?,0,?,?,?,SYSDATE,0)";

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setInt(1, reply.getResNo());
			ps.setInt(2, reply.getUserNo());
			ps.setInt(3, reply.getRepGrade());
			ps.setString(4, reply.getRepPhoto());
			ps.setString(5, reply.getRepContent());

			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.dbClose(ps, con);
		}//finally

		return result;
	}//insertReply

	
	/*
	 * ���� ���� -�Ĵ纰
	 */
	@Override
	public int deleteReply(int resNo, int userNo) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "delete from review where res_no = ? and user_no = ?";
		int result = 0;

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, resNo);
			ps.setInt(2, userNo);

			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.dbClose(ps, con);
		}//finally
		return result;
	}//deleteReply
	

	/*
	 * ���� ���� -�Ĵ纰
	 */
	@Override
	public int updateReply(Reply reply) throws SQLException {
		Connection con = DbUtil.getConnection();
		PreparedStatement ps = null;
		int result = 0;
		String sql = "UPDATE REVIEW SET REVIEW_GRADE=?, REVIEW_PHOTO=?,REVIEW_CONTENT=? where res_no = ? and user_no = ?";
		try {
			con = DbUtil.getConnection();

			ps = con.prepareStatement(sql);
	
			ps.setInt(1, reply.getRepGrade());
			ps.setString(2, reply.getRepPhoto());
			ps.setString(3, reply.getRepContent());
			ps.setInt(4, reply.getResNo());
			ps.setInt(5, reply.getUserNo());

			result = ps.executeUpdate();// ����
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ݱ�
			DbUtil.dbClose(ps, con);
		}//finally
		return result;
	}//updateReply
	
	

	/*
	 * ���� ��ü ���� - �Ĵ纰
	 */
	@Override
	public List<Reply> selectReplyByResNo(int resNo) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Reply> list = new ArrayList<Reply>();
		String sql = "SELECT REVIEW_NO, RES_NO,USER_NO, REVIEW_HITS, REVIEW_GRADE, "
							+ "REVIEW_PHOTO, REVIEW_CONTENT, REVIEW_DATE, REVIEW_AGREE FROM REVIEW WHERE RES_NO = ?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, resNo);
			rs = ps.executeQuery();
			while (rs.next()) {
				int reviewNo = rs.getInt(1);
				resNo = rs.getInt(2);
				int userNo = rs.getInt(3);
				int repHits = rs.getInt(4);
				int repGrade = rs.getInt(5);
				String repPhoto = rs.getString(6);
				String repContent = rs.getString(7);
				String repDate = rs.getString(8);
				int repAgree = rs.getInt(9);
				
				Reply reply= new Reply(reviewNo, resNo, userNo, repHits, repGrade, repPhoto, repContent, repDate, repAgree);
			
				list.add(reply);
			}//while
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}//finally

		return list;
	}//selectReplyByResNo
	
	/**
	 * ���� ��ü ���� - ���������� 
	 */
	@Override
	public List<Reply> selectReplyByUserNo(int userNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Reply> list = new ArrayList<Reply>();
		String sql = "SELECT REVIEW_NO, RES_NO,USER_NO, REVIEW_HITS, REVIEW_GRADE, "
							+ "REVIEW_PHOTO, REVIEW_CONTENT, REVIEW_DATE, REVIEW_AGREE FROM REVIEW WHERE USER_NO = ?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, userNo);
			rs = ps.executeQuery();
			while (rs.next()) {
				int reviewNo = rs.getInt(1);
				int resNo = rs.getInt(2);
				userNo = rs.getInt(3);
				int repHits = rs.getInt(4);
				int repGrade = rs.getInt(5);
				String repPhoto = rs.getString(6);
				String repContent = rs.getString(7);
				String repDate = rs.getString(8);
				int repAgree = rs.getInt(9);
				
				Reply reply= new Reply(reviewNo, resNo, userNo, repHits, repGrade, repPhoto, repContent, repDate, repAgree);
			
				list.add(reply);
			}//while
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}//finally

		return list;
	}//selectReplyByUserNo

	/*
	 * ������ ����
	 */
	@Override
	public int incrementLike(int res_no, int user_no) throws SQLException{
		Connection con = DbUtil.getConnection();
		PreparedStatement ps = null;
		int result = 0;
		String sql = "UPDATE REVIEW SET REVIEW_AGREE = REVIEW_AGREE + 1 WHERE RES_NO = ? AND USER_NO = ?";
		try {
			con = DbUtil.getConnection();

			ps = con.prepareStatement(sql);
			ps.setInt(1, res_no);
			ps.setInt(2, user_no);

			result = ps.executeUpdate();// ����
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ݱ�
			DbUtil.dbClose(ps, con);
		}//finally
		return result;
	}//incrementLike

	

}