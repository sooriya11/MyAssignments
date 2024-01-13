package week2.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
        // Given String
        String test = "I am a software tester";

        // Split the words and have them in an array
        String[] words = test.split("\\s+");

        // Traverse through each word using a loop
        for (int i = 0; i < words.length; i++) {
            // Find the odd index within the loop
            if (i % 2 != 0) {
                // Convert the String array into a character array
                char[] charArray = words[i].toCharArray();

                // Print the even position words in reverse order using another loop
               // System.out.print("Even position word at index " + i + " in reverse: ");
                for (int j = charArray.length - 1; j >= 0; j--) {
                    System.out.print(charArray[j]);
                }
                System.out.println();
            } else {
                // Print the word as it is (concatenate space at the end)
                System.out.print(words[i] + " ");
            }
        }
    }
}