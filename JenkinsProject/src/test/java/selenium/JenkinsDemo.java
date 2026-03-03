package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsDemo {
	
	
	@Test
	public void testSelenium() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		System.out.print("Title of Facebook Page is "+driver.getTitle());
	
		
	}

}



