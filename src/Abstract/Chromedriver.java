package Abstract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver implements Webdriver {

	@Override
	public void get(String url) {
		System.out.println("Get method "+url);
	}

	@Override
	public void findElement(int by) {
		System.out.println("find element ");
	}

	@Override
	public String getTitle() {
		String a="title";
		System.out.println("Get Title");
		return a;
	}

	@Override
	public String getCurrentUrl() {
		String a="url";
		System.out.println("Get Url");
		return a;
	}

	@Override
	public String getPageSource() {
		String a="getPageSource";
		System.out.println("Get getPageSource");
		return a;
		
	}

	@Override
	public void close() {
		System.out.println("Close");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("www.google.com");
		
		driver.getTitle();
		
		driver.getCurrentUrl();
		
		driver.findElements(null);
		
		driver.getPageSource();
		
		driver.close();
			
		
	}
}
