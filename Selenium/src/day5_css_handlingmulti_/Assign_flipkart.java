package day5_css_handlingmulti_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_flipkart {

	public static void main(String[] args) {
	String dir=System.getProperty("user.dir");
	String currentpath=dir+"\\executables\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", currentpath);
	
	WebDriver set= new ChromeDriver();
	
    set.get("https://www.flipkart.com");
    
    
    List<WebElement> deviceName=set.findElements(By.cssSelector("._331-kn>div>div>div>a"));
	
	
    
    
	for(int i=0;i<deviceName.size();i++) {
		System.out.println(deviceName.get(i).getText()+": ");
}
    
    

	}
	
	

}
