import java.util.Scanner;

import classs.Functions;

public class Program {

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		Functions f =new Functions();
		int choice;

		do {

			System.out.println("Enter your choice: ");
			for (int i = 1; i <= 9; i++) {
				System.out.println("[" + i + "]"
						+ "-" + helper(i-1));
			}
			choice = s.nextInt();

			switch (choice) {
			case 1: {
f.printTravelDetails();
				break;
			}
			case 2: {

				break;
			}
			case 3: {

				break;
			}
			case 4: {

				break;
			}
			case 5: {

				break;
			}
			case 6: {

				break;
			}
			case 7: {

				break;
			}
			case 8: {

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		} while (choice != 9);
		System.out.println("Good bay:) ");
	}

	public static String helper(int i) {
		final String str[] = new String[9];
		str[0] = "Enter diteil abuot drive";
		str[1] = "";
		str[2] = "";
		str[3] = "";
		str[4] = "";
		str[5] = "";
		str[6] = "";
		str[7] = "";
		str[8] = "";
		return str[i];
	}

}
