package day10_mouseops_utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Assignment {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		
		WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement src=driver.findElement(By.cssSelector("#draggable"));
		WebElement target=driver.findElement(By.cssSelector("#droppable"));
		s1.performDranAndDrop(src, target);
	}

}