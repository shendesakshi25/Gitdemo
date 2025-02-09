package Abstract;

public interface Webdriver {

public void get(String url);
	
	public void findElement(int by);
	
	public String getTitle();
	
	public String getCurrentUrl();
	
	public String getPageSource();
	
	public void close();
}

