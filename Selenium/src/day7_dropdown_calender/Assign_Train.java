package day7_dropdown_calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign_Train {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://etrain.info/");	
		
		//WebElement train1=driver.findElement(By.id("cbafi1"));
		//train1.sendKeys("PUNE JN (PUNE)");
//		
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebElement dropdown=driver.findElement(By.id("cbafi1"));
//		dropdown.sendKeys("PUNE JN (PUNE)");
//		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
//		//identify dropdown list and click on it
//		dropdown.click();

		
		// **** Identify dropdown list
				WebElement skillDropdown = driver.findElement(By.id("cbafi1"));
                
				skillDropdown.sendKeys("PUNE JN ");
				
				((Select) skillDropdown).selectByValue("PUNE JN");
			
				//Select selectSkill = new Select(skillDropdown);

				//System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption());
				
				((Select) skillDropdown).getFirstSelectedOption().click();
				
//				
//                WebElement skillDropdown2 = driver.findElement(By.id("cbstation2"));
//                
//				skillDropdown2.sendKeys("MUMBAI CST (CSTM)");
//			
//				Select selectSkill1 = new Select(skillDropdown2);
//
//				//System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());
//				
//				
				
				// **** check whether dropdown is multiselect dropdown or not
			//	System.out.println("Is dropdown is allowing you to select multiple option: " + selectSkill.isMultiple());

				// **** get default or already select option
//				WebElement selectedOption=selectSkill.getFirstSelectedOption();
//				String selectedOptionName=selectedOption.getText();
//				System.out.println("Already selected option name: "+selectedOptionName);
				// or
				
	
		
		//WebElement train2=driver.findElement(By.name("cbastation2"));
		//train2.sendKeys("MUMBAI CST (CSTM)");
		
		WebElement btn=driver.findElement(By.id("cbasbmtbtn"));
		btn.click();

	}

}
