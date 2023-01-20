package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger1 {

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
		//identify contact
		driver.findElement(By.cssSelector(".app-list>div:nth-of-type(2)>ul>div>div>li:nth-of-type(3) .module-name")).click();
		driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
	    driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("asds");
	    driver.findElement(By.id("Contacts_editView_fieldName_account_id_create")).click();
	    driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("markets");
	    driver.findElement(By.name("saveButton")).click();
	    driver.findElement(By.xpath("//button[text()='Yes']")).click();
	    driver.findElement(By.className("btn-success")).click();
	    driver.findElement(By.xpath("//h4[@class='module-title pull-left text-uppercase']")).click();
	    
	    driver.findElement(By.xpath("//input[@value='13']")).click();
	    driver.findElement(By.id("Contacts_listView_massAction_LBL_ADD_COMMENT")).click();
	    driver.findElement(By.xpath("//button[text()='Yes']")).click();

	}

}
