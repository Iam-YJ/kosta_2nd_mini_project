package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DbUtil;
import model.dto.Melon;
import model.dto.Noti;
import model.dto.User;

public class UserDAOImpl implements UserDAO{

	@Override
	public int join(User user) {

		return 0;
	}

	@Override
	public int insertBookMark(int userNo, int resNo) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "INSERT INTO BOOKMARK VALUES(BOOKMARK_NO_SEQ.NEXTVAL, ?, ?)";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, userNo);
			ps.setInt(2, resNo);
			
			result = ps.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public int deleteBookMark(int userNo, int resNo) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "DELETE FROM BOOKMARK WHERE USER_NO = ? AND RES_NO = ?";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, userNo);
			ps.setInt(2, resNo);
			
			result = ps.executeUpdate(); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}
	
	@Override
	public List<Melon> selectBookMark(int userNo) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		List<Melon> list = new ArrayList<Melon>();
		String sql = "SELECT * FROM RESTAURANT WHERE RES_NO IN (SELECT RES_NO FROM BOOKMARK WHERE USER_NO = ?)";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, userNo);
			rs = ps.executeQuery();
			while(rs.next()) {
				int resNo = rs.getInt(1);
				String resName = rs.getString(2);
				String resPlace = rs.getString(3);
				String resTel = rs.getString(4);
				String resType = rs.getString(5);
				String resPhoto = rs.getString(6);
				int resHits = rs.getInt(7);
				int resGrade = rs.getInt(8);
				String resPrice = rs.getString(9);
				
				Melon melon = new Melon(resNo, resName, resPlace, resTel, resType, resPhoto, resHits, resGrade, resPrice);
				
				list.add(melon);
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}

	@Override
	public int updatePoint(int userNo, int point) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "UPDATE USERLIST SET USER_POINT = ? WHERE USER_NO = ?";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, point);
			ps.setInt(2, userNo);
			
			result = ps.executeUpdate(); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public int insertFriends(String userId, String frId) {

		return 0;
	}

	@Override
	public int deleteFriends(String frId) {

		return 0;
	}

	@Override
	public int updateUserInfo(User user) {

		return 0;
	}

	@Override
	public List<Noti> selectNotice() {

		return null;
	}

}
