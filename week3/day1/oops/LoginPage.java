package week3.day1.oops;

public class LoginPage extends BasePage {
	public void performCommonTasks() {
		System.out.println("@override PerformTask");

	}

	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.performCommonTasks();
		login.enterText();
		login.findElement();

	}
}
