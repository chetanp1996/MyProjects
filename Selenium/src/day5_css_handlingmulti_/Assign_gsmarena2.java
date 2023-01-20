package day5_css_handlingmulti_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_gsmarena2 {

	public static void main(String[] args) {
		
		String dir=System.getProperty("user.dir");
		String currentpath=dir+"\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", currentpath);
		
		WebDriver set= new ChromeDriver();
		
	    set.get("https://www.gsmarena.com");
	    
	    List<WebElement> deviceName=set.findElements(By.cssSelector("\r\n" + 
	    		".sidebar>div:nth-of-type(3)>div>a"));
		//List<WebElement> devicePrice=set.findElements(By.cssSelector("div#tbodyid h5"));
		
	    
	    
		for(int i=0;i<deviceName.size();i++) {
			System.out.println(deviceName.get(i).getText()+": ");
	}

	}

}
