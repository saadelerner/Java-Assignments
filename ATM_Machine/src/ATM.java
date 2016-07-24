import java.util.Scanner;
import java.util.regex.MatchResult;

public class ATM {

	static Scanner input = new Scanner(System.in);
	int amount = 1000;

	public static void main(String[] args) {

		ATM atm = new ATM();
		atm.pin();
	}

	public void withDrawAmount() {

		System.out.println("\t\tWithdraw Amount");
		System.out.println("\t\t====================\n\n");
		System.out.println("Enter amount to with draw..\n");
		int enterAmount = input.nextInt();
		amount = amount - enterAmount;
		System.out.println("Successful..\nAmount has with drawn..");
		System.out.println("Current Amount : " + amount);
		option();
	}

	public void depositAmount() {

		System.out.println("\t\tDepositing Amount");
		System.out.println("\t\t=================\n\n");
		System.out.println("Enter amount : ");
		int enter_amount = input.nextInt();
		amount = amount + enter_amount;
		System.out.println("Succesful..\nCurrent amount is : " + amount);
		option();
	}

	public void totalAmount() {
		System.out.println("Current Amount : " + amount);
		option();
	}

	public void option() {
		System.out.println("\n\n");

		System.out.println("\t\t  1 = With Draw Amount");
		System.out.println("\t\t  2 = Deposit Amount");
		System.out.println("\t\t  3 =Total Amount");


		System.out.println("Choose Any Option : ");
		int press = input.nextInt();

		switch (press) {
		case 1:
			withDrawAmount();
			break;

		case 2:
			depositAmount();
			break;

		case 3:
			totalAmount();
			break;

		default:
			break;
		}
	}

	public void pin() {
		System.out.println("Enter Pin : ");
		int pin = input.nextInt();

		if (pin == 0000) {
			System.out.println("Logged in..\n\n");
			option();

		} else {
			System.out.println("!!! Wrong pin entered\n");
			pin();
			option();
		}
	}
}
