package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sooriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Narayanan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ss");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("NN");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Insurance Project");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sooriyavelavan@gmail.com");

		driver.findElement(By.name("submitButton")).click();
		String Title = driver.getTitle();
		if (Title.contains("View Lead")) {
			System.out.println("Verified");
		} else {
			System.out.println("Not verified");
		}

		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("atos");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vijay");
		String Title1 = driver.getTitle();
		if (Title1.contains("View Lead")) {
			System.out.println("Verified");
		} else {
			System.out.println("Not verified");

		}
	}

}
