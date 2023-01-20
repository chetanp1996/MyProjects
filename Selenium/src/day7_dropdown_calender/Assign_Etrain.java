package day7_dropdown_calender;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_Etrain {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("https://etrain.info/in");
	    
	    driver.findElement(By.id("cbafi1")).sendKeys("pune");
	    driver.findElement(By.id("suggest_row1")).click();
	    
	    driver.findElement(By.id("cbafi2")).sendKeys("cstm");
	    driver.findElement(By.id("suggest_row1")).click();
	    
	    driver.findElement(By.id("cbasbmtbtn")).click();
	    
	    //table>tbody>tr.even>td.pdlr5.pud3>div.round.bx0_brm>table>tbody>tr>td>span
	    List<WebElement> train = driver.findElements(By.cssSelector("table>tbody>tr.even>td.pdlr5.pud3>div.atbl.round.bx0_brm>table>tbody>tr>td>span"));
	    System.out.println("train = "+ train.size());
	    for(int i=1;i<train.size();i++){
	    	System.out.println(train.get(i).getText());
	    }
		
		
		
	}
}
