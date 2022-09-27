
import java.util.List;

import org.apache.poi.ss.formula.functions.Rows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {
// return data from table
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(4000);
		// store table into webelement
		WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']"));
		//collection of rows
	     List<WebElement>rows= table.findElements(By.tagName("tr"));
	     System.out.println("no of rows are:"+rows.size());
	     // collection of columns
	     for(WebElement eachrow : rows) {
	    	 List<WebElement> columns=eachrow.findElements(By.tagName("td"));
	    	 for(WebElement eachcelldata:columns) {
	    		 String celldata=eachcelldata.getText();
	    		 Thread.sleep(5000);
	    		 System.out.println(celldata+"\n");
	    	 }
	    	 System.out.println();
	     }
	     
	     
		
		
		
		

	}
}
