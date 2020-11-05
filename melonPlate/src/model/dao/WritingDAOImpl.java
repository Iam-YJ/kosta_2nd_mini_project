package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.dto.Melon;
import model.dto.WriList;
import model.dto.Writing;
import util.DbUtil;

public class WritingDAOImpl implements WritingDAO{
	
	@Override
	public List<Melon> selectByName(String resName) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		List<Melon> list = new ArrayList<Melon>();
		String sql = "SELECT * FROM RESTAURANT WHERE RES_NAME = ?";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, resName);
			rs = ps.executeQuery();
			while(rs.next()) {
				int resNo = rs.getInt(1);
				resName = rs.getString(2);
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

/**
 * 글쓰기 - 글 테이블 추가, 글 상세 테이블 추가 
 */
	@Override
	public int insertWriting(Writing writing) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "INSERT INTO WRITING VALUES(WRI_NO_SEQ.NEXTVAL, ?, SYSDATE, ?)";
		
		try {
			con = DbUtil.getConnection();
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			ps.setString(1, writing.getWriTitle());
			ps.setInt(2, writing.getUserNo());
			
			result = ps.executeUpdate();
			if(result==0) {
				con.rollback();
				throw new SQLException("글 등록 실패");
			} else {
				int re[] = insertWriLine(con, writing); //글 상세 등록 
				for(int i : re) {
					if(i != Statement.SUCCESS_NO_INFO) {
						con.rollback();
						throw new SQLException("등록할 수 없음");
					}
				}
			}
		}finally {
			con.commit();
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}
	
	/**
	 * 글 상세 추가 
	 */
	public int[] insertWriLine(Connection con, Writing writing) {
		PreparedStatement ps = null;
		int result[] = null;
		String sql = "INSERT INTO WRILIST VALUES(WRILIST_NO_SEQ.NEXTVAL, ?, ?, ?)";
		
		try {
			ps = con.prepareStatement(sql);
			for(WriList wriList : writing.getWriList()) {
				ps.setInt(1, writing.getWriNo()); //글번호 
				ps.setInt(2, wriList.getResNo()); //식당번호 
				ps.setString(3, wriList.getWriContent()); //내용 
				ps.addBatch();
				ps.clearParameters();
			}
						
			result = ps.executeBatch();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	/**
	 * 글 삭제 
	 */
	@Override
	public int deleteWriting(int wriNo) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "DELETE FROM WRITING WHERE WRI_NO = ?";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, wriNo);
			
			result = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public int updateWriting(Writing writing) {

		return 0;
	}

	/**
	 * 글 전체 조회 
	 */
	@Override
	public List<Writing> selectWriting() throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		List<Writing> list = new ArrayList<Writing>();
		String sql = "SELECT * FROM WRITING INNER JOIN WRILIST ON WRITING.WRI_NO = WRILIST.WRI_NO";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				int wriNo = rs.getInt(1);
				String wriTitle = rs.getString(2);
				String wriDate = rs.getString(3);
				int userNo = rs.getInt(4);
				int wriListNo = rs.getInt(5);
				//String resPhoto = rs.getString(6);
				int resNo = rs.getInt(7);
				String wriContent = rs.getString(8);
				
				Writing writing = new Writing(wriNo, wriTitle, wriDate, userNo);
				WriList wrilist = new WriList(wriListNo, wriNo, resNo, wriContent);
				
				
				list.add(writing);
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return list;
	}

}
