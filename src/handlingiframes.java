import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingiframes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		Actions ac =new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		Thread.sleep(5000);
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw.get(1));
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Create an account']"))).click().perform();
		Thread.sleep(5000);
		driver.close();
		

		
		
		

	}

}
