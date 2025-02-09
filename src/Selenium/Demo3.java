package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_8esh']")).click();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _yla _4jy3 _4jy2 selected _51sy mrm']")).click();
		
		
		WebElement monthDp=driver.findElement(By.id("month"));
		Select a1=new Select(monthDp);
		a1.selectByIndex(1);
		WebElement wb=a1.getFirstSelectedOption();
		String s=wb.getText();
		System.out.println("Selected monthDp is"+s);
		
		WebElement dayDp=driver.findElement(By.id("day"));
		Select a2=new Select(dayDp);
		a2.selectByValue("28");
		WebElement wc=a2.getFirstSelectedOption();
		String b=wc.getText();
		System.out.println("Selected dayDp is"+b);
		
		
		WebElement yearDp=driver.findElement(By.id("year"));
		Select a3=new Select(yearDp);
		a3.selectByVisibleText("2010");
		WebElement wd=a3.getFirstSelectedOption();
		String c=wd.getText();
		System.out.println("Selected yearDp is"+c);
		
		
		

	}

}
