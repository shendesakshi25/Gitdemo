package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleProgram {

	public static void main(String[] args) {
		//set the path of executable browser driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//parent p=new child(WebDriver is parent & ChromeDriver is child)
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
