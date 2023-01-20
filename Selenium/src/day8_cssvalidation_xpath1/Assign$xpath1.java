package day8_cssvalidation_xpath1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign$xpath1 {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("https://www.flipkart.com");
	    
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
	    	
		driver.findElement(By.cssSelector("  html>body>div>div>*:nth-of-type(2)>div>div>*:nth-of-type(3)")).click();
	  
		driver.findElement(By.cssSelector("._2q_g77>._2aDURW>div:nth-of-type(3)")).click();
		
		//String acc= driver.findElement(By.cssSelector("._3pLy-c>div>div>div>div:nth-of-type(2)")).getText();
		
		//System.out.println(" "+acc);
		
		//._3pLy-c>div>div>div>div:nth-of-type(2)
		
		String acc= driver.findElement(By.xpath("   //div[div[div[div[a[div[div[div[text()='SAMSUNG Galaxy F22 (Denim Black, 64 GB)']]]]]]]]/div/div/div/a/div[2]/div[2]/div[1]/div/div[2]")).getText();
		
		System.out.println(" " +acc);
	 
	}

}
