package jdbc;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import entity.*;
public class Dao extends AutoCloseable {
	private Connection con;
	
	
	@Override
	public int save(User s) throws Exception {
		int count; 
		String sql = "INSERT INTO students VALUES(?,?,?,?,?,?,?)"; 
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, s.getId());
			stmt.setString(2, s.getFull_Name());
			stmt.setString(3, s.getEmail());
			stmt.setString(4, s.getPassword());
			stmt.setInt(5, s.getPhone_no());
			stmt.setInt(6, s.getPhone_no());
			stmt.setDate(7, (Date) s.getCreated_time());
			
			count = stmt.executeUpdate(); 
		}
		return count;
	}
}
