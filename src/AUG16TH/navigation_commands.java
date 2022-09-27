package AUG16TH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_commands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(10000);
		driver.findElement(By.partialLinkText("Gmail"));click();
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
		Thread.sleep(10000);
		driver.navigate().refresh();
		
		
	
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

}
