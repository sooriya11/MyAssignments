package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookRegistration {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sooriya");
		driver.findElement(By.name("lastname")).sendKeys("Narayanan");
		driver.findElement(By.name("reg_email__")).sendKeys("sooriyanarayanan97@gmail.com");
		// driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sooriyanarayanan97@gmail.com");

		driver.findElement(By.id("password_step_input")).sendKeys("sooriya");
		WebElement dateOfBirth = driver.findElement(By.id("day"));
		Select dateOfBirthdd = new Select(dateOfBirth);
		dateOfBirthdd.selectByValue("11");

		WebElement dateOfBirth1 = driver.findElement(By.id("month"));
		Select dateOfBirthmm = new Select(dateOfBirth1);
		dateOfBirthmm.selectByValue("11");

		WebElement dateOfBirth2 = driver.findElement(By.id("year"));
		Select dateOfBirthYear = new Select(dateOfBirth2);
		dateOfBirthYear.selectByValue("1997");

		driver.findElement(By.xpath("//*[text()='Male']")).click();

	}

}