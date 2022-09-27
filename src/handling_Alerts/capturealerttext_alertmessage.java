package handling_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturealerttext_alertmessage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[title='Sign in']")).click();
	    String alertmessage = driver.switchTo().alert().getText();
	    System.out.println(alertmessage);
	    driver.switchTo().alert().accept();
	    driver.quit();

	}

}
