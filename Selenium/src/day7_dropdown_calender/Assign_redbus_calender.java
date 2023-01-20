package day7_dropdown_calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                //wrong
public class Assign_redbus_calender {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	driver.get("https://redbus.in");
	driver.findElement(By.cssSelector("input[id='src']")).sendKeys("Pune");
	driver.findElement(By.cssSelector(".autofill.homeSearch *:nth-child(2)")).click();
	driver.findElement(By.cssSelector("input[id='dest']")).sendKeys("goa");
	driver.findElement(By.cssSelector(".autofill.homeSearch *:nth-child(2)")).click();
	driver.findElement(By.cssSelector("next")).click();
	
	driver.findElement(By.cssSelector("tbody>tr:nth-of-type(5)>td:nth-of-type(3)")).click();
	driver.findElement(By.id("search_btn")).click();
	driver.findElement(By.cssSelector("#filter-block > div > div.details > ul.dept-time.dt-time-filter > li:nth-child(1) > label.custom-checkbox")).click();
	
	
	List<WebElement> buses =driver.findElements(By.cssSelector("li>div.clearfix.bus-item>div>div>div>div.travels.lh-24.f-bold.d-color"));
	System.out.println("buse = "+buses.size());
	for(int i=0;i<buses.size();i++) {
		System.out.println(buses.get(i).getText());
	}
	

	}

}
