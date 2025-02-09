package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleProgram4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");

		
       WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		String abc=driver.getCurrentUrl();
		
		System.out.println(abc);

	}

}
