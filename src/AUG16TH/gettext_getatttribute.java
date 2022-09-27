package AUG16TH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext_getatttribute {

	public static void main(String[] args) throws Throwable {
		WebDriver panja=new ChromeDriver();
		panja.manage().window().maximize();
		panja.manage().deleteAllCookies();
		panja.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		String driver= panja.findElement(By.linkText("OrangeHRM, Inc")).getText();
		System.out.println(driver);
		String ganesh=panja.findElement(By.linkText("OrangeHRM, Inc")).getAttribute("href");
		System.out.println(ganesh);
		
	}
		
		
		

}
