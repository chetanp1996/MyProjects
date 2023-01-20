package day2_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome$actitime {

	public static void main(String[] args) {
	String Currentdir= System.getProperty("user.dir");
	System.out.println("the user dir is :" +Currentdir);
	String chromePath = Currentdir + "\\executables\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", chromePath);
	
	WebDriver driver = new ChromeDriver();
	
	//actual valid url
	driver.get("https://demo.actitime.com");
	
	//title validation
	String actualTitle = driver.getTitle();
	System.out.println("the actual title is :" +actualTitle);
	String expectedTitle = "actitime";
	System.out.println("compare the title " +actualTitle.equals(expectedTitle));
	
	//url validation
	String actualUrl= driver.getCurrentUrl();
	System.out.println("the actual url is :" +actualUrl);
	String expectedUrl = "https://demo.actitime.com ";
	System.out.println("compare the url :" +actualUrl.contains(expectedUrl));
	
	//page source length
	String pagesource = driver.getPageSource();
	System.out.println(" the page source length is :" +pagesource.length());
	
	
     // Actual data fillup
	driver.get("https://demo.actitime.com");
	
	WebElement username=driver.findElement(By.name("username"));
	
	username.clear();
	username.sendKeys("admin");
	
	WebElement pwd=driver.findElement(By.name("pwd"));
	
	//pwd.clear();
	pwd.sendKeys("manager");
	
	WebElement submitBtn=driver.findElement(By.id("loginButton"));
	submitBtn.click();
    
	driver.close();
	
			
	
	
	
	
	
	
	
	
	
	}

}
