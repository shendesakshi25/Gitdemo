package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Abstract.Webdriver;

public class Demo1 {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","eC:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.ex");
		Webdriver driver=new Webdriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String a=driver.getTitle();
		System.out.println(a);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		//driver.close();
	}
	
}
