package jdbc;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

import entity.*;
public class Main {
	public static void main(String[] args) {
		try(Dao dao = new DaoImpl()){ 
			Date sqlDate = Date.valueOf(LocalDate.now());
			User u = new User(1,"Thumdeo Warhade","thumdeowarhade@gmail.com","Thumdeo",54,sqlDate,"nknaneienpv"); 
			int count = dao.save(u); 
			System.out.println("Rows affected : "+count);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
