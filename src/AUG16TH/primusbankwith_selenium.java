package AUG16TH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class primusbankwith_selenium {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(6000);
		WebElement username=driver.findElement(By.xpath("//input[@id='txtuId']"));
		username.clear();
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPword']"));
		password.clear();
		password.sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(5000);
		driver.close();
	


	
	
		
	}

}
