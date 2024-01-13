package week2.day1;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,3,2,8,6,7};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i]!= i+1) {
				System.out.println("Missing element is: "+(i+1));
				break;
			}
			
		}
		

	}

}
