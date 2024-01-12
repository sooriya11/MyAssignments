package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PVR {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		// TODO Auto-generated method stub
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		// ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@placeholder='Search your city']")).click();
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='genre']"));
		Select value = new Select(dropdown);
		value.selectByVisibleText("ANIMATION");
		WebElement language = driver.findElement(By.xpath("//select[@name='lang']"));
		Select value1 = new Select(language);
		value1.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"//img[@src='https://originserver-static1-uat.pvrcinemas.com/app/movies/1/402x516/HO00018056.jpg?v=12']"))
				.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Paw Patrol']")));
//		e.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		WebElement cinima = driver.findElement(By.name("cinemaName"));
		Select value3 = new Select(cinima);
		value3.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		WebElement Timing = driver.findElement(By.name("timings"));
		Select value4 = new Select(Timing);
		value4.selectByVisibleText("03:00 PM - 06:00 PM");
		driver.findElement(By.name("name")).sendKeys("sooriya");
		driver.findElement(By.name("mobile")).sendKeys("8838211427");
		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		driver.findElement(By.name("email")).sendKeys("sooriya@gmail.com");

		WebElement food = driver.findElement(By.name("food"));
		Select value5 = new Select(food);
		value5.selectByVisibleText("Yes");
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.name("comment")).sendKeys("Nil");
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();

		String Title = driver.getTitle();

		if (Title.contains("Movie Library")) {
			System.out.println("The Title is" + Title);

		} else {
			System.out.println("Not verified");
		}

	}

}
