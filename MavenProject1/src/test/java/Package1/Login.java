package Package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
		 WebDriver driver;
		 
		 @Test
		 public void logintest()
		 {
			 driver= new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			 
			 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			 driver.findElement(By.xpath("//ul[@class='oxd-main-menu'] /li[1]")).click();
			 driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[5]")).click();
			 driver.findElement(By.cssSelector("button[class*='oxd-button']")).click();
			 driver.findElement(By.cssSelector("div[class='oxd-form-row'] input")).sendKeys("Indian67");
			 driver.findElement(By.xpath("//button[@type='submit']")).click();
			 
			  
		 }
		}


