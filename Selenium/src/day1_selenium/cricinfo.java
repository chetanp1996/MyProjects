package day1_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfo {

	public static void main(String[] args) {
    String dir=System.getProperty("user.dir");
    String load=dir + "\\executables\\chromedriver.exe";
    
    System.setProperty("webdriver.chrome.driver", load);
    
    WebDriver path = new ChromeDriver();
    
    path.get("https://www.cricinfo.com");
    
    //url title validation
    String actualtitle= path.getTitle();
    System.out.println("the actual url is :" +actualtitle);
    String expectedtitle= "cricinfo";
    System.out.println("the expected url is :" +expectedtitle);
    System.out.println("compare the title "+actualtitle.equals(expectedtitle));
    //url validation
    
    String actualurl=path.getCurrentUrl();
    System.out.println("the actual url is :" +actualurl);
    String expectedurl="espncricinfo.com";
    System.out.println("the expected url is :" +expectedurl);
   System.out.println("compare two url "+actualurl.contains(expectedurl)); 
    
   //pagesource length
   
   String Page =path.getPageSource();
   System.out.println("the length of page source :"+Page.length());
   
   
   path.close();
	}

}
