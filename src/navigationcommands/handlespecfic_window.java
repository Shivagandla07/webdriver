package navigationcommands;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class handlespecfic_window {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@aria-label='Flight opens a new window']//label[contains(text(),'FLIGHTS')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='https://hotel.irctctourism.com/hotels']//label[contains(text(),'HOTELS')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();
		Thread.sleep(5000);
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(5000);
		System.out.println(brw);
		driver.switchTo().window(brw.get(2));
		Thread.sleep(5000);
		String expected =("IRCTC HOTELS");
		String actual=driver.getTitle();
		if(expected.equalsIgnoreCase(actual)) {
			System.out.println("matching tittle"+expected+""+actual);
		}
		else {
			System.out.println("not matching"+expected+""+actual);
		}
			driver.close();

		
	

	}

}
