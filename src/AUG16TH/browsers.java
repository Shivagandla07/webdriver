package AUG16TH;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class browsers {

	public static void main(String[] args) throws Throwable {
		// creating instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
	   
		
		
		
		
		
	

		
		

	}

}
