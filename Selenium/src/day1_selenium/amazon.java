

package day1_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		String dir= System.getProperty("user.dir");
		String currentPath = dir+"\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",currentPath);
		
		WebDriver work=new ChromeDriver();
		//actual url is
        work.get("https://www.amazon.in");		
		
		//get url title validation
        
        String actualTitle= work.getTitle();
        String expectedTitle="amazon.in";
        System.out.println("the expected title is :" +expectedTitle);
        System.out.println("actual amazon tile is :" +actualTitle);
        System.out.println("comaparison of two title is :" +actualTitle.equals(expectedTitle));
        
        //get url validation
        
        String actualUrl=work.getCurrentUrl();
        String expectedUrl = "https://www.amazon.in";
        System.out.println("the actual url is:" +actualUrl);
        System.out.println("compare two url :" +actualUrl.contains(expectedUrl));
        
        //page source length
        
        String Pagesource=work.getPageSource();
        System.out.println("the length of page source is :" +Pagesource.length());
        
        work.close();
        
        
        
        
	}

}
