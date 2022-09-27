package selectclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclassmethods_ex_fb {

	public static void main(String[] args) throws Throwable {
    WebDriver pulsar=new ChromeDriver();
    pulsar.manage().window().maximize();
    pulsar.manage().deleteAllCookies();
    pulsar.navigate().to("https://www.facebook.com/");
    Thread.sleep(5000);
    pulsar.findElement(By.partialLinkText("Create New Accou")).click();
    Thread.sleep(5000);
    Select student=new Select(pulsar.findElement(By.cssSelector("#day")));
    Thread.sleep(5000);
    Select hero =new Select(pulsar.findElement(By.cssSelector("#month")));
    Thread.sleep(5000);
    Select royal=new Select(pulsar.findElement(By.cssSelector("#year")));
    Thread.sleep(5000);
    student.selectByVisibleText("18");
    Thread.sleep(3000);
    hero.selectByVisibleText("Oct");
    Thread.sleep(3000);
    royal.selectByIndex(23);
    Thread.sleep(3000);
    pulsar.quit();
    
    
    

	}

}
