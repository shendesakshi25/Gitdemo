package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (3)\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
driver.get("https://opensource-demo.orangehrmlive.com/");
		
Thread.sleep(7000);

driver.findElement(By.className("button")).click();


	}

}
