package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Newvaribles\\Selenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		driver.findElement(By.name("firstName")).sendKeys("AB Tester");
		driver.findElement(By.name("lastName")).sendKeys("AB Tester");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
//		WebElement ABTester=driver.findElement(By.xpath("//div[text()='AB Tester']"));
//		System.out.println("User name is displayed or not? "+ABTester.isDisplayed());
//		System.out.println("User name is functional or not? "+ABTester.isEnabled());
//	    ABTester.click();
//	    driver.findElement(By.xpath("//a[text()='Job']")).click();
//	    WebDriverWait wait=new WebDriverWait(driver,20);
//	    div.oxd-table-row.oxd-table-row--with-order.oxd-table-row--clickable div.oxd-table-cell.oxd-table-cell.oxd-padding-cell div.oxd-table-cell-actions button.oxd-icon-button.oxd-table-cell-action-space
//	    WebElement dropdown=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div[2]/div/div[2]/div/div/div[2][@class='oxd-select-text--after']"));
//	    wait.until(ExpectedConditions.elementToBeClickable(dropdown));
//	    dropdown.click();

		List<WebElement> users=driver.findElements(By.xpath("//div[@role='row']"));
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).findElement(By.cssSelector("div:nth-child(3)>div:nth-child(1)")).getText().equals("AB Tester")) {
			System.out.println("inside if statement");	
			Thread.sleep(2000);
			users=driver.findElements(By.xpath("//div[@role='row']"));
			WebElement checkbox = users.get(i).findElement(By.cssSelector("div.oxd-table-cell.oxd-padding-cell div.oxd-table-card-cell-checkbox"));
			checkbox.click();
			
			//users=driver.findElements(By.xpath("//div[@role='row']"));
			//users.get(i).findElement(By.cssSelector("div.oxd-table-row.oxd-table-row--with-order.oxd-table-row--clickable div.oxd-table-cell.oxd-table-cell.oxd-padding-cell div.oxd-table-cell-actions button.oxd-icon-button.oxd-table-cell-action-space")).click();
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash-fill oxd-button-icon']")).click();
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash oxd-button-icon']")).click();
		
			}
					
		}
		

	}

}
