package assignmentClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverBasic {

	public static void main(String[] args) {


		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.findElement(By.name("q")).sendKeys("way2automation");
	
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gNO89b"))).click();
		
			
		WebElement menu = driver.findElement(By.xpath("//*[@class='LC20lb DKV0Md']"));
		menu.click();
		WebElement tab = driver.findElement(By.linkText("RESOURCES"));
		Actions action = new Actions(driver);
		action.moveToElement(tab).perform();
		
		driver.findElement(By.linkText("Practice site 1")).click();
		/*
		driver.findElement(By.name("name")).sendKeys("Noobura");
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select selectList = new Select(country);
		selectList.selectByValue("Canada");		
		driver.findElement(By.xpath("(//input[@class='button'])[2]")).click();
		
		*/
	}

}
