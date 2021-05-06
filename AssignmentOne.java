package assignmentClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOne {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("way2automation");
		
		driver.findElement(By.className("gNO89b")).click();
		

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Clicking on first link on search results");
		WebElement flink = driver.findElement(By.xpath("//*[@class='LC20lb DKV0Md']"));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		flink.click();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Links:    "+allLinks.size());
		for(int i=0; i<allLinks.size(); i++) {
		System.out.println("Text    :"+allLinks.get(i).getText());
		}
		
		
	}

}
