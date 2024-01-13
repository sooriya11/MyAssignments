package week1.day2;

public class Browser {

	public static void main(String[] args) {
		Browser chrome = new Browser();
		chrome.launchBrowser("google");
		chrome.loadUrl();

	}
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser Started Successfully");
		return browserName;
		
		
	}
	public void loadUrl() {
		System.out.println("Appliction url loaded Successfully ");
		
	}

}
