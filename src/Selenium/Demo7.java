package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement wb=driver.findElement(By.name("login"));
		
		Actions act=new Actions(driver);
		
		act.click(wb).build().perform();
		
		String a=driver.findElement(By.className("_9ay7")).getText();
		
		System.out.println(a);

	}

}
