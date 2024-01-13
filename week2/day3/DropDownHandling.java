package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[contains(@id,'createLeadForm_firstName')])[1]")).sendKeys("Sooriya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Narayanan");

		WebElement DropDown = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select source = new Select(DropDown);
		source.selectByIndex(4);

		WebElement DropDownIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select source1 = new Select(DropDownIndustry);
		source1.selectByVisibleText("Insurance");

		WebElement DropDownOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select source2 = new Select(DropDownOwnership);
		source2.selectByVisibleText("Corporation");

		driver.findElement(By.name("submitButton")).click();
		String tabTitle = driver.getTitle();
		if (tabTitle.contains("View Lead")) {
			System.out.println("Verified");

		}else {
			System.out.println("Not Verified");
		}
		
		driver.quit();

	}

}
