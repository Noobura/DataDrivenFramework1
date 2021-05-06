package assignmentClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentThree {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.timesofindia.indiatimes.com//poll.cms");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String num=driver.findElement(By.id("mathq2")).getText();
	int a=Integer.parseInt(String.valueOf(num.charAt(0)));
	int b=Integer.parseInt(String.valueOf(num.charAt(4)));
	System.out.println(a);
	System.out.println(b);
	String ans = null;
	char c= num.charAt(2);
	if(c=='+') 
		    ans = String.valueOf(a+b);			
	else if(c=='-') 
		ans = String.valueOf(a-b);
		
	else if(c=='*') 
		ans = String.valueOf(a*b);
	else if(c=='/')
		ans = String.valueOf(a*b);
	
	driver.findElement(By.id("mathuserans2")).sendKeys(ans);	
	
	}
	
		
}
