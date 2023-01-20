package day4_valid_css1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_orange {

	public static void main(String[] args) {
	String dir = System.getProperty("user.dir");
	String currentpath=dir + "\\executables\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver",currentpath);
	
	WebDriver cdriver =new ChromeDriver();
	
    cdriver.get("https://opensource-demo.orangehrmlive.com");
    //implicit wait
    cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   
    
    //maximize the page
    cdriver.manage().window().maximize();
    
    
    
    
	
     WebElement username=cdriver.findElement(By.name("username"));
    
	username.clear();
	username.sendKeys("Admin");
	
	WebElement pwd = cdriver.findElement(By.name("password"));
	
	pwd.clear();
	pwd.sendKeys("admin123");
	
	WebElement submitBtn=cdriver.findElement(By.className("orangehrm-login-button"));
	submitBtn.click();
	
	//WebElement forgot = cdriver.findElement(By.className("orangehrm-login-forgot"));
	//forgot.click();
	
	WebElement logout = cdriver.findElement(By.className("oxd-userdropdown-link"));
	logout.click();
	
	//cdriver.findElement(By.xpath("/web/index.php/auth/logout")).click();
	
	}

}
