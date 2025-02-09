package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (3)\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("selenium testing");
	}

}
