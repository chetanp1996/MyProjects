package day10_mouseops_utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_flipkart {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");	
	
	WebElement element = driver.findElement(By.xpath("//body"));
	element.sendKeys(Keys.ESCAPE);
	
	 List<WebElement> deviceName=driver.findElements(By.cssSelector("._331-kn>div>div>div>a"));
	// List<WebElement> deviceName=driver.findElements(By.xpath("/html/body/div/div/div[3]/div/div"));	
	 System.out.println("mainu count " +deviceName.size());
	 for(int i=0;i<deviceName.size();i++) {
			System.out.println(deviceName.get(i).getText()+": ");
	}
	 
	 Actions act= new Actions(driver);
	
		act.moveToElement(deviceName.get(2), 0, 0).perform();
		mouseHoverWithCords(act, deviceName.get(1),0,0);

	 
	 
	
	}
	static void mouseHoverWithCords(Actions act, WebElement option, int x, int y) throws InterruptedException {
		
		act.moveToElement(option, x, y).perform();
	}
	
}
