package week2.day2;

public class CountOfGivenCharachater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="TestLeaf";
		char targetChar = 'e';
		int count = 0;
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]==targetChar) {
				count++;
			}
			System.out.println("Count of '" + targetChar + "' in the given String: " + count);
			//System.out.println(count);
			
		}
		

	}

}
