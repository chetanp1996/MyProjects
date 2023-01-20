package day4_valid_css1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_vtiger {
	
	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");
		String currentpath=dir + "\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",currentpath);
		
		WebDriver cdriver =new ChromeDriver();
		
	    cdriver.get("");
	    //implicit wait
	    //cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
		WebElement username= cdriver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		
		
		WebElement password=cdriver.findElement(By.name("password"));
		password.clear();
//		password.sendKeys("Test@123");https://demo.vtiger.com/vtigercrm/index.php
//		
////		WebElement submitbtn=cdriver.findElement(By.className("buttonBlue"));
////		submitbtn.click();
//		
////		WebElement history=cdriver.findElement(By.className("add widget"));
////		history.click();
////		
		
		
	
	
	
	
	
	
	}
}
