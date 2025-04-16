package entity;

import java.util.Objects;

public class Categories {
	private int id;
	private String Title;
	private String description;

	public Categories() {
		super();
	}

	public Categories(int id, String title, String description) {
		super();
		this.id = id;
		Title = title;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", Title=" + Title + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Title, description, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categories other = (Categories) obj;
		return Objects.equals(Title, other.Title) && Objects.equals(description, other.description) && id == other.id;
	}

}
