package AUG16TH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_methods_isdisplayed {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(4000);
		WebElement rose = driver.findElement(By.name("reg_email_confirmation__"));
		boolean seetha= rose.isDisplayed();
		System.out.println(seetha);
		Thread.sleep(4000);
		WebElement radiobutton=driver.findElement(By.name("sex"));
		Thread.sleep(4000);
		boolean flag=radiobutton.isSelected();
		Thread.sleep(4000);
		System.out.println(flag);
		driver.quit();
		

	}

}
