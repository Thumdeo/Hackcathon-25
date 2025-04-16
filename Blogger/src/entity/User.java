package entity;

import java.util.Date;
import java.util.Objects;

public class User {
	private int id;
	private String full_Name;
	private String email;
	private String password;
	private int phone_no;
	private Date created_time;
	private String address;
	public User() {
		
	}
	public User(int id, String full_Name, String email, String password, int phone_no, Date created_time,
			String address) {
		
		this.id = id;
		this.full_Name = full_Name;
		this.email = email;
		this.password = password;
		this.phone_no = phone_no;
		this.created_time = created_time;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFull_Name() {
		return full_Name;
	}
	public void setFull_Name(String full_Name) {
		this.full_Name = full_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, created_time, email, full_Name, id, password, phone_no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(created_time, other.created_time)
				&& Objects.equals(email, other.email) && Objects.equals(full_Name, other.full_Name) && id == other.id
				&& Objects.equals(password, other.password) && phone_no == other.phone_no;
	}
	

}
