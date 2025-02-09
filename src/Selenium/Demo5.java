package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
	
		//we have focus on alert pop window.
		
		Alert act=driver.switchTo().alert();
		
		//capture the alter message
		
		String a=act.getText();
		System.out.println(a);
		
		Thread.sleep(4000);
		//click on ok button
		act.accept();
		
		Thread.sleep(4000);
		driver.close();
	

	}

}
