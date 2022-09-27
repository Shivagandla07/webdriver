package AUG16TH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle_Geturl_length {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String  url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println( url .length());
		driver.close();
		
		

	
		

	}

}
