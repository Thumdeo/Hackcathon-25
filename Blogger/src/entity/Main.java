package entity;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		UserMenu();
	}
	
	
	
	
	
	
	private static void UserMenu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit ");
			System.out.println("1. Sign Up");
			System.out.println("2. Sign In");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (signUpUser() == true)
					signInUser();

				break;

			case 2:
				if (signInUser() == true) {
					int Preference;
					do {
						System.out.println("0. Exit ");
						System.out.println("1. View My Blogs");
						System.out.println("2. View All Blogs");
						System.out.println("3. Delete Blog");
						System.out.println("4. Search Blog");
						System.out.println("5. Edit Blog");
						System.out.println("6. Create Blog");
						System.out.println("7. Show categories");
						System.out.println("8. Add Categories ");
						Preference = sc.nextInt();
						switch (Preference) {
						case 1:
							viewBlog();
							break;
						case 2:
							veiwAllBlog();
							break;
						case 3:
							deleteBlog();
							break;
						case 4:
							searchBlog();
							break;
						case 5:
							editBlog();
							break;
						case 6:
							createBlog();
							break;
						case 7:
							showcategories();
							break;
						case 8:
							addCategories();
							break;

						}

					} while (choice != 0);
				}
				break;

			default:
				break;

			}
			while (choice != 0);

		} while (choice != 0);
	}

//	System.out.println("0. Exit ");
//	System.out.println("1. View My Blogs");
//	System.out.println("2. View All Blogs");
//	System.out.println("3. Delete Blog");
//	System.out.println("4. Search Blog");
//	System.out.println("5. Edit Blog");
//	System.out.println("6. Create Blog");
//	System.out.println("7. Show categories");
//	System.out.println("7. Show categories");
//	System.out.println("8. Add Categories ");
	public static boolean signUpUser() {
		return true;
	}

	public static boolean signInUser() {
		return true;
	}

	public static void viewBlog() {

	}

	public static void veiwAllBlog() {

	}

	public static void deleteBlog() {

	}

	public static void searchBlog() {

	}

	public static void editBlog() {

	}

	public static void createBlog() {

	}

	public static void showcategories() {

	}

	public static void addCategories() {

	}
}
