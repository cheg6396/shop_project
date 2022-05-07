package shop.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import shop.com.dao.ShopConnection;
import shop.com.vo.MemberVo;

public class MemberDao implements MemberDaoAble{

	@Override
	public MemberVo detail(String id) throws ClassNotFoundException, SQLException {
		Connection conn=ShopConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement("SELECT * FROM MEMBER WHERE id=?");
		ps.setString(1, id);
		ResultSet rs=ps.executeQuery();
		MemberVo mem = new MemberVo();
		while(rs.next()) {
			mem.setId(rs.getString("id"));
			mem.setName(rs.getString("name"));
			mem.setAddress(rs.getString("address"));
			mem.setAddress_detail(rs.getString("address_detail"));
			mem.setEmail(rs.getString("email"));
			mem.setPhone(rs.getString("phone"));
			mem.setPw(rs.getString("pw"));
			mem.setBirth(rs.getDate("birth"));
			mem.setSignup_time(rs.getDate("signup_time"));
			mem.setGrade(rs.getByte("grade"));
		}
		return mem;
	}

	@Override
	public boolean insert(MemberVo mem) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(MemberVo mem) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MemberVo login(String id, String pw) throws ClassNotFoundException, SQLException {
		MemberVo mem = null;

		Connection conn=ShopConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement("SELECT * FROM MEMBER WHERE id=?");
		ps.setString(1, id);
		ps.setString(2, pw);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			mem = new MemberVo();
			mem.setId(rs.getString("id"));
			mem.setName(rs.getString("name"));
			mem.setAddress(rs.getString("address"));
			mem.setAddress_detail(rs.getString("address_detail"));
			mem.setEmail(rs.getString("email"));
			mem.setPhone(rs.getString("phone"));
			mem.setPw(rs.getString("pw"));
			mem.setBirth(rs.getDate("birth"));
			mem.setSignup_time(rs.getDate("signup_time"));
			mem.setGrade(rs.getByte("grade"));
		}
		return mem;
	}
}
