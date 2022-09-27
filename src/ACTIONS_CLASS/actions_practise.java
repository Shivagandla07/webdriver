package ACTIONS_CLASS;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class actions_practise {

	public static void main(String[] args)throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE);
		ac.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))).click().sendKeys("shoes").perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("About Us"))).contextClick().perform();
		Thread.sleep(6000);
		 Robot r =new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 driver.close();
		 
				 
		
		
		
		
		

	}

}
