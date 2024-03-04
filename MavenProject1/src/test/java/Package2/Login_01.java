package Package2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_01 {
	WebDriver driver;
	
	@Test
	 public void Test1()
	{
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 
		 driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 driver.findElement(By.xpath("//ul[@class='oxd-main-menu'] /li[1]")).click();
		 driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[2]")).click();
		 driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li[1]")).click();
		 driver.findElement(By.cssSelector("button[class*='oxd-button']")).click();
	}

}
