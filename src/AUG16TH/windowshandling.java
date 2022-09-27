package AUG16TH;

import java.util.ArrayList;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowshandling {
	public static void main(String[] args) throws Throwable {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.navigate().to("http://www.nyka.com/");
     Thread.sleep(5000);
     Actions ac = new Actions(driver);
     ac.moveToElement(driver.findElement(By.xpath("//li[@class='MegaDropdownHeadingbox']//a[contains(text(),'skin')]"))).perform();
     ac.moveToElement(driver.findElement(By.xpath("//div[@class='MegaDropdown-ContentHeading']//a[@target='_blank'][normalize-space()='Moisturizers']"))).click().perform();
    ArrayList<String>ar=new ArrayList<String>(driver.getWindowHandles());
     driver.switchTo().window(ar.get(1));
    String br = driver.findElement(By.cssSelector("div[id='title'] h1[class='css-mrgb7e']")).getText();
     System.out.println(""+ br +"");
    
   
 
   

     
     
     

	}

}
