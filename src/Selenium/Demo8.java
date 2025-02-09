package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
         driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source1=driver.findElement(By.id("box2"));
		WebElement source2=driver.findElement(By.id("box3"));
		WebElement source3=driver.findElement(By.id("box4"));
		
		
		WebElement target1=driver.findElement(By.id("box101"));
		WebElement target2=driver.findElement(By.id("box102"));
		WebElement target3=driver.findElement(By.id("box103"));
		
		WebElement wb=driver.findElement(By.id("capitals"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source1, target1).release().build().perform();
		
		Thread.sleep(2000);
		
		act.dragAndDrop(source1, wb).release().build().perform();
		Thread.sleep(2000);
		
		//driver.close();
		

	}

}
