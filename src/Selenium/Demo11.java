package Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/l470/Desktop/HTML%20Code/multipleBrowser.html");
		
		
		
		driver.findElement(By.name("lname")).sendKeys("abc");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Visit Facebook")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Orange HRM")).click();
		Thread.sleep(4000);
		
		Set<String> handles=driver.getWindowHandles();//3 Tabs
		
		ArrayList<String> ls=new ArrayList<String>(handles);
		
		Thread.sleep(4000);
		driver.switchTo().window(ls.get(1));//Ornage HRM
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		Thread.sleep(4000);
		driver.switchTo().window(ls.get(2));//Facebook
		
		driver.findElement(By.name("email")).sendKeys("pune");
		
		Thread.sleep(4000);
		driver.switchTo().window(ls.get(0));// Main window
		
		driver.findElement(By.name("fname")).sendKeys("data");
		Thread.sleep(4000);
		
		driver.switchTo().window(ls.get(1));//Ornage HRM
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(8000);
		driver.quit();
}
}
