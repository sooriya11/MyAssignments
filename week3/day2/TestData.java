package week3.day2;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData test = new LoginTestData();
		test.enterCrendentials();
		test.navigateToHomePage();
		test.enterUserName();
		test.enterPassword();

	}

	public void enterCrendentials() {
		System.out.println("Enter credentials");
	}

	public void navigateToHomePage() {
		System.out.println("Navigate to home Page");

	}

}

class LoginTestData extends TestData {
	public void enterUserName() {
		System.out.println("Enter User Name");
	}

	public void enterPassword() {
		System.out.println("Enter Password");

	}
}
