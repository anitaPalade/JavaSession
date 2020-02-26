package wrapperClass;

import java.util.Scanner;

public class CharacterClassMethods {
	public static void main(String[] args) {

		System.out.print("Enter the first input:");

		Scanner scanner = new Scanner(System.in);

		char[] value1 = scanner.nextLine().toCharArray();
		int result1 = 0;
		// Count the characters for a specific character.
		for (char ch1 : value1) {
			result1 = Character.charCount(ch1);
		}
		// Print the result.
		System.out.print("The value comes to: " + result1 + "\n");

		System.out.print("Enter the second input:");
		char[] value2 = scanner.nextLine().toCharArray();
		for (char ch2 : value2) {
			int result2 = Character.hashCode(ch2);
			System.out.print("The hash code for the character '" + ch2 + "' is given as:" + result2 + "\n");
		}
		System.out.print("Enter the third input:");
		char[] value3 = scanner.nextLine().toCharArray();
		for (char ch3 : value3) {
			boolean result3 = Character.isDigit(ch3);
			if (result3) {
				System.out.println("The character '" + ch3 + "' is a digit. ");
			} else {
				System.out.println("The character '" + ch3 + "' is not a digit.");
			}
		}
	}
}