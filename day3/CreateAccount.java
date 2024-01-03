package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		Thread.sleep(2000);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Nagaraj");
		driver.findElement(By.id("officeSiteName")).sendKeys("tmt");

		driver.findElement(By.xpath("//input[@name=\"annualRevenue\"]"));
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industry1 = new Select(industry);
		industry1.selectByVisibleText("Computer Software");

		WebElement ownershipdropdown = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(ownershipdropdown);
		ownership.selectByVisibleText("S-Corporation");
		WebElement dataSourcedropdown = driver.findElement(By.id("dataSourceId"));
		Select dataSource = new Select(dataSourcedropdown);
		dataSource.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingCampaigndd = driver.findElement(By.id("marketingCampaignId"));
		Select marketingCampaign = new Select(marketingCampaigndd);
		marketingCampaign.selectByIndex(6);
		WebElement Statedd = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(Statedd);
		state.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();

		String taptitle = driver.getTitle();
		if (taptitle.contains("Account Details")) {
			System.out.println("Verified");
		} else {
			System.out.println("Unable to verified");

		}

	}

}
