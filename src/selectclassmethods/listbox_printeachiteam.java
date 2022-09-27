package selectclassmethods;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_printeachiteam {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		Select listbox=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		List<WebElement>shiva=listbox.getOptions();
		System.out.println(""+shiva.size());
		Thread.sleep(200);
		for(WebElement each:shiva) {
			System.out.println(each.getText());
		}
		
	
		
		
		
			
		
		
		
	

	}


	
		
	
}


