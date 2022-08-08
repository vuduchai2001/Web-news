package Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import Connect.DBConnect;
import Entity.TaiKhoan;

public class loginDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;	
	public TaiKhoan check(String username, String pass) {
		try {
			String sql = "select * from demo.taikhoan where username = ? and password = ? ";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while (rs.next()) {
				TaiKhoan tk = new TaiKhoan(rs.getString(1),rs.getString(2));
				return tk;
			}
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		return null;
	}
	
}
