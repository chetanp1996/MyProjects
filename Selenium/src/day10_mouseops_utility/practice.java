package day10_mouseops_utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/");
		
		Actions action =new Actions(driver);
		
		List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		
		action.moveToElement(mainMenu.get(2)).perform();
		
		
	//	mouseHoverOverTheElement(action, mainMenu.get(2));
			
		rightClick(action, mainMenu.get(1));

	}
//		
//		static void mouseHoverOverTheElement(Actions action, WebElement element) {
//			action.moveToElement(element).perform();
//		}
//		
		static void rightClick(Actions act, WebElement option) {
			System.out.println("Option name is : " + option.getText());
			act.moveToElement(option).contextClick().build().perform();
			act.contextClick(option).build().perform();
		}

		
		
		
		
		
		
	
//		for(int i=0;i<mainMenu.size();i++) {
//			WebElement option=mainMenu.get(i);
//		    action.moveToElement(option).perform();
//			//Thread.sleep(1000);
//		}
//		
		
		
		
		
		
		
		
		
	

}
