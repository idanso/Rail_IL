package classs;

import java.util.Scanner;

public class Functions {

	public void printTravelDetails() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting point");
		helper(s);
		System.out.println("Enter leaving time");
		helper(s);
		System.out.println("Enter destination");
		helper(s);
		System.out.println("Enter arrival time");
helper(s);
	}

	public static String helper(Scanner s) {

		return s.nextLine();
	}
}
