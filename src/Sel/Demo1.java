package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (3)\\chromedriver.exe");
          //it will connect to actual browser
		WebDriver driver=new ChromeDriver();
          //up casting
		driver.get("https://www.google.com/?s");
		//method overriding
		System.out.println(driver.getTitle());
		//capture the title
		
		System.out.println(driver.getCurrentUrl());
		//capture Url
		
		//capture the pageSource
				System.out.println("======================================================================================");
				String a=driver.getPageSource();
				
				System.out.println(a);
	}

}
