package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dto.Melon;
import util.DbUtil;

public class MelonDAOImpl implements MelonDAO{

	@Override
	public List<Melon> selectByHits(int hits) {

		return null;
	}

	@Override
	public List<Melon> selectByGrade(double grade) {

		return null;
	}

	@Override
	public List<Melon> selectByType(String type) {

		return null;
	}

	@Override
	public int updateHits(int resNo) {

		return 0;
	}

	@Override
	public List<Melon> selectByArea(String area) {

		return null;
	}

}
