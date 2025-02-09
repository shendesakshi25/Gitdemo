package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {
	public static WebElement wb;
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_8esh']")).click();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _yla _4jy3 _4jy2 selected _51sy mrm']")).click();
		
		WebElement monthDp=driver.findElement(By.id("month"));
		Select a1=new Select(monthDp);
		//a1.selectByVisibleText("Feb");
		
		a1.selectByIndex(8);
		
		//a1.selectByValue("2");
		
		//get selected value of Dropdown
		  WebElement wb1=a1.getFirstSelectedOption();
		  String SelectedValue=wb1.getText(); 
		  System.out.println(SelectedValue); 
		   
		  //count Value from dropdown
		  List<WebElement> AllOptions=a1.getOptions();
		  int count=AllOptions.size();
		  System.out.println(count);

		  //print Dropdown Values
		  for(WebElement abc:AllOptions){
		     String Value=abc.getText();
		     System.out.println(Value);
		}
		
		
		
		
	}
}

		
		
		
		
		
		
		
		
		
		