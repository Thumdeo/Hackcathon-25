package entity;

import java.util.Date;
import java.util.Objects;

public class Blogs {
	private int id;
	private String title;
	private String contents;
	private Date created_time;
	private User user;
	private Categories categories;

	public Blogs() {

	}

	public Blogs(int id, String title, String contents, Date created_time, User user, Categories categories) {
		super();
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.created_time = created_time;
		this.user = user;
		this.categories = categories;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categories, contents, created_time, id, title, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blogs other = (Blogs) obj;
		return Objects.equals(categories, other.categories) && Objects.equals(contents, other.contents)
				&& Objects.equals(created_time, other.created_time) && id == other.id
				&& Objects.equals(title, other.title) && Objects.equals(user, other.user);
	}

}
