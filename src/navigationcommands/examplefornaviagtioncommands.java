package navigationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class examplefornaviagtioncommands {

	public static void main(String[] args) throws Throwable {
		WebDriver madhu=new ChromeDriver();
	    madhu.manage().window().maximize();
	    madhu.manage().deleteAllCookies();
	    madhu.navigate().to("https://in.search.yahoo.com/");
	    Thread.sleep(4000);
	    madhu.findElement(By.xpath("//div[@title='Mail']")).click();
	    Thread.sleep(4000);
	    madhu.navigate().back();
	    Thread.sleep(4000);
	    madhu.navigate().forward();
	    Thread.sleep(4000);
	    madhu.navigate().refresh();
	    Thread.sleep(4000);
	    madhu.quit();
	    
	    
	    

	  
	    
		

	}

}
