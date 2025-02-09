package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleProgram3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
       WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		String a=driver.getTitle();
		
		System.out.println(a);
		
		if(a.contains("Facebook"))
		{
			System.out.println("test case is pass");
		}
		else {
			System.out.println("Test case is fail");
		}
				
	}


	}


