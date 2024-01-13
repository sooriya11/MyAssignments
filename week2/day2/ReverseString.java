package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName = "TestLeaf";
		
		char[] try1 = companyName.toCharArray();
		for (int i = try1.length - 1; i >= 0; i--) {
			System.out.print(try1[i]);
			
		}

	}

}
