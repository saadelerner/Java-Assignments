import java.util.Scanner;

public class Menu_Option_Management {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Teachers_Menu_Option tmo = new Teachers_Menu_Option();
		Student_Menu_Option smo = new Student_Menu_Option();

		do {
			System.out.println("\t\t\tMain Menu");
			System.out.println("\n\t\t1) Teacher Admin\n");
			System.out.println("\t\t2) Student Admin\n");
			System.out.println("Enter Your Option: ");
			int option = scan.nextInt();

			switch (option) {
			case 1:
				tmo.teacher_Func();
				break;

			case 2:
				smo.student_Func();
				break;

			default:
				break;
			}
		} while (true);
	}
}
