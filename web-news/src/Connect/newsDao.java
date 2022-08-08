package Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entity.TaiKhoan;
import Entity.TinTuc;

public class newsDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int rss;
	public void update( String caption, String image, String category, String trending, String date, String details,int iD) {
		try {
			String sql = "UPDATE demo.tintuc SET caption = ?,image= ?, category = ?,trending = ?, date = ?,detailssss = ? WHERE ID = ?";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, caption);
			ps.setString(2, image);
			ps.setString(3, category);
			ps.setString(4, trending);
			ps.setString(5, date);
			ps.setString(6, details);
			ps.setInt(7, iD);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void delete(int id) {
		try {
			conn = new DBConnect().getConnection();
			String sql = "DELETE  FROM demo.tintuc where id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rss = ps.executeUpdate();
			System.out.print(rss);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public List<TinTuc> getListNews() {
		try {
			List<TinTuc> List = new ArrayList<>();
			String sql = "Select * From demo.tintuc";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				List.add(new TinTuc(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6),rs.getString(7)));
			}
			return List;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public List<TinTuc> getDetailsNew(int id) {
		try {
			List<TinTuc> List = new ArrayList<>();
			String sql = "Select * From demo.tintuc where ID = ?";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				List.add(new TinTuc(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6),rs.getString(7)));
			}
			return List;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public List<TinTuc> getListTrendingTop() {
		try {
			List<TinTuc> ListTrendingTop = new ArrayList<>();
			String sql = "Select * From demo.tintuc where ID = ?";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 1);
			rs = ps.executeQuery();
			while(rs.next()) {
				ListTrendingTop.add(new TinTuc(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6),rs.getString(7)));
			}
			return ListTrendingTop;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public List<TinTuc> getListTrendingRight() {
		try {
			List<TinTuc> ListTrendingRight = new ArrayList<>();
			String sql = "Select * From demo.tintuc where trending = ? order by id desc limit 5 ;";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "true");
			rs = ps.executeQuery();
			while(rs.next()) {
				ListTrendingRight.add(new TinTuc(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6),rs.getString(7)));
			}
			return ListTrendingRight;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public List<TinTuc> getListTrendingBottom() {
		try {
			List<TinTuc> ListTrendingBottom = new ArrayList<>();
			String sql = "Select * From demo.tintuc where trending = ? limit 3 ;";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "true");
			rs = ps.executeQuery();
			while(rs.next()) {
				ListTrendingBottom.add(new TinTuc(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6),rs.getString(7)));
			}
			return ListTrendingBottom;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public List<TinTuc> getListWeeklyTopNews() {
		try {
			List<TinTuc> ListWeeklyTopNews = new ArrayList<>();
			String sql = "Select * From demo.tintuc where DATEDIFF(now(), date)<=? limit ?";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 7);
			ps.setInt(2, 5);
			rs = ps.executeQuery();
			while(rs.next()) {
				ListWeeklyTopNews.add(new TinTuc(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6),rs.getString(7)));
			}
			return ListWeeklyTopNews;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public int getNumberPage() {
		try {
			String sql = "select count(*) from demo.tintuc";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int total = rs.getInt(1);
				int count = total/4;
			if(total%4!=0) {
				count++;
			}
			return count;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	public List<TinTuc> getPaging(int index) {
		try {
			List<TinTuc> list = new ArrayList<>();
			String sql = "select * from demo.tintuc limit 4 offset ?";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (index-1)*4);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new TinTuc(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6),rs.getString(7)));
			}
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public List<TinTuc> getPagingCategory(String cate, int index) {
		try {
			List<TinTuc> list = new ArrayList<>();
			String sql = "select * from demo.tintuc where category = ? limit 4 offset ? ";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, cate);
			ps.setInt(2, (index-1)*4);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new TinTuc(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6),rs.getString(7)));
			}
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public void insert(String caption, String image, String category, String trending, String date, String details) {
		try {
			String sql = "INSERT INTO `demo`.`tintuc`(caption,image,category,trending,date,detailssss) VALUES (?,?,?,?,?,?)";
			conn = new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, caption);
			ps.setString(2, image);
			ps.setString(3, category);
			ps.setString(4, trending);
			ps.setString(5, date);
			ps.setString(6, details);
			rss = ps.executeUpdate();
			System.out.print(rs);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
