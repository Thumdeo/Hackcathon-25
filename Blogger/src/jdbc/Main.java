package jdbc;
import entity.*;
public class Main {
	try(Dao dao = new DaoImpl()){
		User s = new User(1,"Thumdeo Warhade","thumdeowarhade@gmail.com","Thumdeo",54,date,"nknaneienpv"); 
		int count = dao.save(s); 
		System.out.println("Rows affected : "+count);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
