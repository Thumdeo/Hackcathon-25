package jdbc;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.*;
public class DaoImpl implements AutoCloseable ,Dao{
	private Connection con;
	public  Dao() throws Exception{
		con =util.getConnection();
	}
	@Override
	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public list save(User u) throws Exception {
		int count; 
		String sql = "INSERT INTO User VALUES(?,?,?,?,?,?,?)"; 
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, u.getId());
			stmt.setString(2, u.getFull_Name());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			stmt.setInt(5, u.getPhone_no());
			stmt.setDate(6, (Date) u.getCreated_time());
			stmt.setString(7, u.getAddress());
			
			count = stmt.executeUpdate(); 
		}
		return count;
	}
}
