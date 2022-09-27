import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileread_write_text {

	public static void main(String[] args) throws Throwable {
		File f =new File("d:\\dell.txt");
		FileWriter fw =new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String para1 =driver.findElement(By.xpath("//p[contains(text(),'Primus Bank dates back to 1955 when Primus North C')]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.flush();
		bw.close();
		driver.close();
		
	

	}


}