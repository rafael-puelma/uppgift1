package uppgift1;

import java.util.Scanner;

public class uppgift1 {

	public static void main(String[] args) {

		String correctPassword = "Password";
		int numberOfTry = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter Password:   ");
		String passwordFromUser = scanner.next();

		if (passwordFromUser.equals(correctPassword)) {
			System.out.println("Welcome in ");

		}
		while (!passwordFromUser.equals(correctPassword)) {
			if (numberOfTry == 0) {
				System.out.println("Password is not Correct");
				numberOfTry++;
				passwordFromUser = scanner.next();
			}

			if (numberOfTry == 1) {
				System.out.println("Password is not Correct, You have two more chances");
				numberOfTry++;
				passwordFromUser = scanner.next();

			} else if (numberOfTry == 2) {
				System.out.println("Password is not Correct, One more chance");
				numberOfTry++;
				passwordFromUser = scanner.next();

			} else if (numberOfTry == 3) {
				System.out.println("you have no more chances, please try again tomorrow");
				return;
			}
		}
	}

}
