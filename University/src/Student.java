import java.util.Scanner;

public class Student {

	Scanner input = new Scanner(System.in);
	private String id;
	private String name;
	private String dateOfBirth;
	private String course;
	private String email;

	public Student(String id, String name, String dateOfBirth, String course, String email) {
		// TODO Auto-generated constructor stub

		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.course = course;
		this.email = email;
	}

	public String getId() {

		return id;
	}

	public String getName() {

		return name;
	}

	public String getDateOfBirth() {

		return dateOfBirth;
	}

	public String getCourse() {

		return course;
	}

	public String getEmail() {

		return email;
	}

	public String toString() {
		System.out.println();
		return "-ID :" + id + "\t|\t" + "-Name :" + name + "\t|\t" + "-DoB :" + dateOfBirth + "\t|\t" + "-Course :"
				+ course + "\t|\t" + "-Email :" + email;

	}
}
