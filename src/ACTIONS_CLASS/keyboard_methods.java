package ACTIONS_CLASS;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_methods {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    driver.get("https://www.amazon.in/");
    Actions ac =new Actions(driver);
    driver.findElement(By.id("searchDropdownBox")).click();
    ac.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(3000);
    ac.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(3000);
    ac.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(3000);
    ac.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(3000);
    ac.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(4000);
    ac.sendKeys(Keys.ARROW_UP).perform();
    Thread.sleep(4000);
    ac.sendKeys(Keys.ARROW_UP).perform();
    
    
    
	
	

	}

}
