package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amezon {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		// TODO Auto-generated method stub
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		// ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for Boys" + Keys.ENTER);
		String result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"))
				.getText();
		System.out.println(result);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();

		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		driver.findElement(By.xpath("//option[text()='Newest Arrivals']")).click();
		
		String Product = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]")).getText();
		System.out.println("Product Name:"+ Product);
		
		String price = driver.findElement(By.xpath("(//div[@class='a-row'])[2]")).getText();
		System.out.println("Product Price"+price);
		
		System.out.println(driver.getTitle());  
		

	}

}
