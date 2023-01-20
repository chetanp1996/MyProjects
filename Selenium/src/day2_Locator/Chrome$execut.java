package day2_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome$execut {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		String currentpath= path+"\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", currentpath);

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		
		WebElement username=driver.findElement(By.name("UserName"));
		
		username.clear();
		username.sendKeys("execution");
		
		WebElement pwd=driver.findElement(By.name("Password"));
		
		pwd.clear();
		pwd.sendKeys("admin");
		
		WebElement submitBtn=driver.findElement(By.name("Login"));
		submitBtn.submit();;
		
		
		
		
		
		
		
		
		
	}

}
