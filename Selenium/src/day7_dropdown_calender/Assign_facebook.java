package day7_dropdown_calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
                          //wrong//
public class Assign_facebook {

	public static void main(String[] args) throws InterruptedException {
	
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:www.facebook.com");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("form>div:ntj-of-type(5")).click();
		WebElement day = driver.findElement(By.id("day"));
		System.out.println("visibility validation = " + day.isDisplayed());
		System.out.println("Enable validation = " + day.isEnabled());
		day.click();
		Select days=new Select(day);
		//day validtion
		List<WebElement> options = days.getOptions();
		System.out.println(days.getFirstSelectedOption().getText());
		String actualDay = "";
		System.out.println("count "+options.size());
		for(int i=0; i<options.size();i++) {
		   actualDay = actualDay + options.get(i).getText() + ","; 	
		}
		String expectedDay = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31";
		System.out.println("Actual day "+ actualDay);
		System.out.println("validating days = "+ actualDay.equals(expectedDay));
		days.selectByIndex(12);
		System.out.println("selected day = "+ days.getFirstSelectedOption().getText());
		
		//month validation
		WebElement month = driver.findElement(By.id("month"));
		month.click();
		Select months = new Select(month);
		List<WebElement> monthOption = months.getOptions();
		String actMonth = "";
		System.out.println("month count = "+ monthOption.size());
		for(int i=0;i<monthOption.size();i++) {
			actMonth = actMonth + monthOption.get(i).getText()+",";
		}
		String expMonth = "jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec,";
		System.out.println("validating month = "+actMonth.equals(expMonth));
		months.selectByIndex(4);
		System.out.println("selected month = "+ months.getFirstSelectedOption().getText());
			
			}
}	
		
	
		
		
	


