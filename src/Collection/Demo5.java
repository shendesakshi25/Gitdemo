package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/l470/Desktop/HTML%20Code/dropDown.html");
		
		WebElement wb=driver.findElement(By.id("cars"));
		Select sel=new Select(wb);
		List<WebElement> ls =sel.getOptions();

		ArrayList al=new ArrayList();
		
		for(WebElement abc:ls)
		{
			String data=abc.getText();
			al.add(data);
		}
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
		
		
		
	}


	}


