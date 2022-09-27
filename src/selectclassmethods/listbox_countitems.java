package selectclassmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_countitems {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//store list box items into list box
		Select element= new Select(driver.findElement(By.id("//select[@id='searchDropdownBox']")));
		List<WebElement>allitems=element.getOptions();
		System.out.println(""+allitems.size());
		for (WebElement each :allitems )
		{
			Thread.sleep(5000);
			System.out.println(each.getText());
			
			
		}
			
			
	
		
		
		
		
		
				
				
				
		
		
		

	}

}
