package notePadPractice;

import java.util.Scanner;
/*This program accepts user input that has to
 * be an integer between 20 and 30.
 * if the user input enters a valid integer within the range
 * their number is displayed.
 * If the user enters a string or character the program
 * will ask the user to enter a valid integer again
 * I have used a do while loop , so do the following 
 * check for an integer,accept if it is an integer  */

public class UserInputGitHubTemplate {

	public static void main(String[] args) {
		int range = 0;
		Scanner scanUser = new Scanner(System.in);
		do {
			System.out.println("Please enter a valid number between 1 and 10");

			if (scanUser.hasNextInt()) { // checks to see if it is an integer
				range = scanUser.nextInt(); // Now store the integer in a variable
			} else {
				System.out.println("Not a valid integer");

			}
			scanUser.nextLine(); // clears the data in the scanner

		} while (range < 20 || range > 30);

		System.out.println("The number entered is: " + range);

		scanUser.close();

	}

}
