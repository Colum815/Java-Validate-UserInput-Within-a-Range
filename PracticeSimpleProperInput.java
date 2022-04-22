package notePadPractice;

import java.util.Scanner;
/*This program accepts user input that has to
 * be an integer between 20 and 30 (exact same concept as the other file in this repository
 * the only difference is I demonstrate this program using a while instead of a do while).
 * if the user input enters a valid integer within the range
 * their number is displayed.
 * If the user enters a string or character the program
 * will ask the user to enter a valid integer again
 * I have used a do while loop , so do the following 
 * check for an integer,accept if it is an integer  */

public class PracticeSimpleProperInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter a number");
			if (in.hasNextInt()) {
				int accept = in.nextInt();
				if (accept >= 1 && accept <= 10) {
					System.out.println("Number is " + accept + " and between 1 and 10");
					flag = false;
				} else {
					System.out.println("Not between 1 and 10");
					in.nextLine();

				}

			} else {
				System.out.println("Not an int");
				in.nextLine();
			}
		}
	}

}
