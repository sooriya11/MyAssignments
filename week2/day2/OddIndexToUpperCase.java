package week2.day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// Given String
		String inputString = "changeMe";

		// Convert the String to a character array
		char[] charArray = inputString.toCharArray();

		// Iterate through each character from end to start
		for (int i = charArray.length - 1; i >= 0; i--) {
			// Find odd index
			if (i % 2 != 0) {
				// Change the character to uppercase
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}

		// Print the modified characters
		System.out.println(charArray);

	}
}
