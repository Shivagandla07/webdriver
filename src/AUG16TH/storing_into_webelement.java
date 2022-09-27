package AUG16TH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class storing_into_webelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys("shivagandla");
		WebElement password=driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys("shiva123");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
		
		
		
				




	}

}
