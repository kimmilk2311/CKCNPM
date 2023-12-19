package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.PrescriptionDetail;

public class PrescriptionDetailDao implements DaoInterface<PrescriptionDetail> {
	public static PrescriptionDetailDao getInstance() {
		return new PrescriptionDetailDao();
		
	}
	@Override
	public boolean insert(PrescriptionDetail t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(PrescriptionDetail t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(PrescriptionDetail t) {
		try {
			Connection c = JDBCUtil.getConnection();
			String sql = "UPDATE PrescriptionDetail SET  , Dose = ? , Frequency = ? , Quanitity = ? ";
			PreparedStatement pst;
			pst = c.prepareStatement(sql);
			pst.setString(1, t.getDose());
		    pst.setString(2, t.getFrequency());
		    pst.setString(3, t.getQuantity());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<PrescriptionDetail> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrescriptionDetail selectByid(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleleAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<PrescriptionDetail> find(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
