package jdbc;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import entity.*;
public class Dao extends AutoCloseable {
	int save(User u) throws Exception ; 
}
