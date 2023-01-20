package day3_syn_browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //page title
	    String actualtitle=driver.getTitle();
	    System.out.println("title is " +actualtitle);
	    driver.findElement(By.xpath("//a[text()='Books']")).click();
	    String booktitle=driver.getTitle();
	    System.out.println("book title: " +booktitle);
	    //Explicit wait
	    WebDriverWait wait=new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-search")));
	    
	    
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}