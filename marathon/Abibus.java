package marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Abibus {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();

		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		// ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		String FirstBus = driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
		System.out.println("FirstBus: " + FirstBus);
		String AvailableSeats = driver.findElement(By.xpath("//small[text()=' Seats Available'][1]")).getText();
		System.out.println("Available seats"+AvailableSeats);
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//td[@rowspan=\"1\"   and  @colspan=\"1\"][10])")).click();
		driver.findElement(By.xpath("//div[@class='label'][1]")).click();
		driver.findElement(By.xpath("//div[@class='label'][1]")).click();
		
		String fare = driver.findElement(By.xpath("//span[text()='Base Fare :']/span")).getText();
		System.out.println("Bus Fare: "+fare);
		
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
		driver.close();
		

	}

}
