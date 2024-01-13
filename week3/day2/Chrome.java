package week3.day2;

public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println("open the browse in incognito");
	}

	public void clearCache() {
		System.out.println("Clear browser cache");

	}
	public static void main(String[] args) {
		Chrome chrome = new Chrome();
		chrome.browserName ="chrome";
		chrome.browserVersion= "17";
		System.out.println("Browser Name"+chrome.browserName );
		System.out.println("Browser Version"+chrome.browserVersion);
		chrome.openIncognito();
		chrome.clearCache();
		
		
	}

}
