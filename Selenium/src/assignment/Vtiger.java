package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Newvaribles\\Selenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//login
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("Test@123");
		driver.findElement(By.className("buttonBlue")).click();
		//identify dashoboard
		driver.findElement(By.id("appnavigator")).click();
		driver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();
        //identify lead
		driver.findElement(By.xpath("//a[@title='Leads']")).click();
		driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
		//fill the element
		driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("Electrical");
		driver.findElement(By.xpath("//button[text()='Speichern']")).click();
		driver.findElement(By.xpath("//h4[@class='module-title pull-left text-uppercase']")).click();
		//checkbox
		driver.findElement(By.xpath("//input[@class='listViewEntriesCheckBox']")).click();
	    //again edit
		// driver.findElement(By.id("Leads_listView_massAction_LBL_EDIT")).click();
	    // driver.findElement(By.id("Leads_editView_fieldName_company")).sendKeys("engg");
	    // driver.findElement(By.xpath("//button[text()='Speichern']")).click();
		
		//validation
		WebElement valid=driver.findElement(By.xpath("//a[text()='Electrical']"));
		System.out.println(valid.isDisplayed());
	     
	    //for delete
				
	    driver.findElement(By.id("Leads_listView_massAction_LBL_DELETE")).click();
	    driver.findElement(By.xpath("//button[@class='btn confirm-box-ok confirm-box-btn-pad btn-primary']")).click();
	    

	    WebElement validation=driver.findElement(By.xpath("//a[text()='Electrical']"));
	    System.out.println(validation.isSelected());
	}

}




