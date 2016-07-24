import java.util.ArrayList;
import java.util.Scanner;

public class Teachers_Menu_Option extends Menu_Option_Management {

	ArrayList<Teacher> arrList_teacher = new ArrayList<Teacher>();
	Scanner input = new Scanner(System.in);
	int menuChoice = 5;
	int idi = 1;
	// String[] st;

	public void teacher_Func() {

		do {
			System.out.println("\n\n\t\t\tTeacher Record Menu\n");
			System.out.println("\t\t1) Add Teacher\n");
			System.out.println("\t\t2) Show Teacher\n");
			System.out.println("\t\t3) Search Teacher\n");
			System.out.println("\t\t4) Delete Teacher\n");
			System.out.println("\t\t5) Exit\n");

			try {
				System.out.println("Enter Choice : ");
				menuChoice = Integer.parseInt(input.nextLine());

			} catch (NumberFormatException e) {
				continue;
			}

			switch (menuChoice) {
			case 1:
				addTeacher();
				break;

			case 2:
				showTeacher();
				break;

			case 3:
				searchTeacher();
				break;

			case 4:
				deleteTeacher();
				break;

			default:
				System.out.println();
				break;
			}
		} while (menuChoice < 5);
	}

	public void addTeacher() {
		System.out.println("Enter Mob No : ");
		int id = idi;
		idi++;

		System.out.println("Full Name : ");
		String name = input.nextLine();

		System.out.println("Date of Birth : ");
		String dateOfBirth = input.nextLine();

		System.out.println("Course : ");
		String course = input.nextLine();

		System.out.println("Email : ");
		String email = input.nextLine();

		Teacher teacher = new Teacher(id, name, dateOfBirth, course, email);
		arrList_teacher.add(teacher);

	}

	public void showTeacher() {
		System.out.println("\t\t\t|Teachers Details|\n");
		// System.out.println("\t\tName\t\tDOB\t\tCourse\t\tEmail");
		for (Teacher teacher_Print : arrList_teacher) {
			System.out.println(teacher_Print);
		}
	}

	public void searchTeacher() {
		System.out.println("\t\t~~~~~Searching~~~~~");
		System.out.println("\nEnter ID :");
		String search = input.nextLine();
		for (Teacher search_Teacher : arrList_teacher) {
			if (search_Teacher.getId()==Integer.valueOf(search)) {

				System.out.println("-ID :" + search_Teacher.getId() + "\t\t" + "-Name :" + search_Teacher.getName()
						+ "\t\t" + "-DoB :" + search_Teacher.getDateOfBirth() + "\t\t" + "-Course :"
						+ search_Teacher.getCourse() + "\t\t" + "-Email :" + search_Teacher.getEmail());
				break;
			} else {
				System.out.println("\nNot found");
			}
		}
	}

	public void deleteTeacher() {
		System.out.println("\t\t~~~~~Deleting~~~~~");
		System.out.println("\nEnter ID :");
		String delete = input.nextLine();
		for (Teacher delete_Teacher : arrList_teacher) {
			if (delete_Teacher.getId()==Integer.valueOf(delete)) {
				arrList_teacher.remove(delete_Teacher);
				System.out.println("Deleted...");
				break;
			} else {
				System.out.println("Not found....");
			}
		}
	}
}