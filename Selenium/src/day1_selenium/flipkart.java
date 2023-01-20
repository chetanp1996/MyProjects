package day1_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
	
    System.setProperty("webdriver.chrome.driver","D:\\Newvaribles\\Selenium\\executables\\chromedriver.exe");
		
	ChromeDriver cdriver = new ChromeDriver();	
	//to enter the url on the open browser	
	cdriver.get("https://www.flipkart.com/");	
		
	//application title validation
	String actualTitle=cdriver.getTitle();
	String expectedTitle="flipkart";
	System.out.println("Actual flipkart pagr title is : "+actualTitle);
	System.out.println("flipkart title validation: "+actualTitle.equals(expectedTitle));
	
	//validation url
	String actualUrl=cdriver.getCurrentUrl();
	String expectedUrl="https://www.flipkart.com";
	System.out.println("Actual flipkart page url is :"+actualUrl);
	System.out.println("Expected flipkart page url is :"+expectedUrl);
	System.out.println("flipkart url validation: "+actualUrl.contains(expectedUrl));
	
	//page source code
	String pagesource = cdriver.getPageSource();
	System.out.println("page source length is :"+pagesource.length());
	
	
	
	
	}

}
