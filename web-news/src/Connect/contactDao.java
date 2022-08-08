package Connect;

import java.beans.Statement;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entity.LienHe;

public class contactDao {
	Connection conn = null;
	PreparedStatement ps = null;
	int rs;
	ResultSet resultSet = null;
	
	public void insert(String name, String email, String subject, String message) {
		try {
			conn = new DBConnect().getConnection();
				String sql = "INSERT INTO demo.lienhe(Name,Email,Subject,Message) VALUES(?,?,?,?)";
				ps = conn.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3, subject);
				ps.setString(4, message);
				rs = ps.executeUpdate();
				System.out.print(rs);
		} catch (Exception e) {
			// TODO: handle exception
		} }
	public List<LienHe> getListContacts() {
		try {
			List<LienHe> list = new ArrayList<>();
			String sql = "select * from demo.lienhe";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			resultSet = ps.executeQuery();
			while(resultSet.next()) {
				list.add(new LienHe(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5)));
			}
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public void Delete(int id) {
		try {
			conn = new DBConnect().getConnection();
			String sql = "DELETE  FROM demo.lienhe where id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeUpdate();
			System.out.print(rs);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
	