package assignmentClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDownList {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.wikipedia.org/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//driver.findElement(By.id("searchLanguage")).sendKeys("Eesti");
	WebElement dropdown = driver.findElement(By.id("searchLanguage"));
	Select select = new Select(dropdown);
	
	//select.selectByVisibleText("Eesti");
	select.selectByVisibleText("English");
	select.selectByValue("hi");
	

	
	List<WebElement> values = select.getOptions();
	
	//0 - size-1(70-1=69)
	System.out.println("Total values are : "+values.size());
	
	System.out.println("Print 13th value: " +values.get(12).getText());
	
	
	for(int i=0; i<values.size(); i++) {
		
		System.out.println( values.get(i).getAttribute("lang"));
		
	}
	
	
	
	//WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[11]/div[3]"));
	
	

	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	System.out.println("----Printing links----");
	
	System.out.println("Total links are: "+links.size());
	
	
	for(WebElement link: links) {
		
		System.out.println(link.getText()+" -- URL IS ---"+link.getAttribute("href"));
	}
	 
	
	WebElement secondBlock = driver.findElement(By.className("other-projects"));
	secondBlock.findElements(By.className("other-project")).get(2).click();
	}
	
	

}
