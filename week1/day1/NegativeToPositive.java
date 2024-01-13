package week1.day1;

public class NegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -40;
		int positiveNumber = 0;
		if(number<0) {
			//positiveNumber = number*(-1);
			positiveNumber = Math.abs(number);
			System.out.println("Positive Number:"+positiveNumber);
		}
	

	}

}
