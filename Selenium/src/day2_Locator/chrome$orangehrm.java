package day2_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome$orangehrm {

	public static void main(String[] args) {
	String currentdir = System.getProperty("user.dir");
	String workingpath = currentdir + "\\executables\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", workingpath);
	
	WebDriver cdriver = new ChromeDriver();
	
	// actual url
	cdriver.get("https://opensource-demo.orangehrmlive.com");
	
	//atual Title validation
	String actualTitle= cdriver.getTitle();
	System.out.println("the actual title is "+actualTitle);
    String expectedTitle ="orangehrmlive";
    System.out.println("compare two values :" +actualTitle.equals(expectedTitle));
    
    //actual url valdation
    String actualUrl=cdriver.getCurrentUrl();
    System.out.println("the actual url is :" +actualUrl);
    String expectedUrl="https://opensource-demo.orangehrmlive.com";
    System.out.println("compare two values :" +actualUrl.contains(expectedUrl));
    
    //pagesource 
    String pagesource = cdriver.getPageSource();
    System.out.println(" page source length is :" +pagesource.length());
	
    
    
    cdriver.get("https://opensource-demo.orangehrmlive.com");
    
    
    
	WebElement username= cdriver.findElement(By.className("username"));
	//username.clear();
	username.sendKeys("Admin");
	
	WebElement pwd = cdriver.findElement(By.className("password"));
	//pwd.clear();
	pwd.sendKeys("admin123");
	
	WebElement submitBtn=cdriver.findElement(By.className("main orangehrm login button"));
	submitBtn.click();
	
	cdriver.close();
	
	
	
	
	
	
	}

}
