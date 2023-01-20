package day1_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		
		String dir=System.getProperty("user.dir");
		String executablepath= dir+"\\executables\\chromedriver.exe";
		
	    System.setProperty("webdriver.chrome.driver",executablepath);
		ChromeDriver cdriver = new ChromeDriver();

		cdriver.get("https://www.google.com");
		
		 cdriver.close();
	}

}
