package selectclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class eaxmple_selectlistbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("9182870052");
		Thread.sleep(5000);
        WebElement shiva=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]"));
        shiva.clear();
        shiva.sendKeys("shiva@123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Login')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(text(),'Home')]")).click();
        Thread.sleep(5000);
        Select home=new Select(driver.findElement(By.cssSelector("div._331-kn._2tvxW div.InyRMC._3Il5oO div._37M3Pb div.eFQ30H:nth-child(4) a:nth-child(1) div._1psGvi.SLyWEo div:nth-child(1) > div.xtXmba")));
        home.selectByVisibleText("div._331-kn._2tvxW div.InyRMC._3Il5oO div._37M3Pb div.eFQ30H:nth-child(4) a:nth-child(1) div._1psGvi.SLyWEo div:nth-child(1) > div.xtXmba");
        Thread.sleep(5000);
        
        
        
        
        
        
        
        
        
        
        
	

	}

}
