package Package3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import greenKart.pageobject.CartPage;
import greenKart.pageobject.CataloguePage;
import greenKart.pageobject.CheckoutPage;
import greenKart.pageobject.ConfirmationPage;
import greenKart.pageobject.LandingPage;
    
public class Endtoend {
	public static void main(String[] args) throws InterruptedException
	{
	
	WebDriver driver;
    driver =new ChromeDriver();
	driver.manage().window().maximize();
	String productName ="ZARA COAT 3";
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	LandingPage landingPage= new LandingPage(driver);
	landingPage.goTo();
	CataloguePage cataloguePage= landingPage.loginApplication("anishakhan@gmail.com", "Anisha@123");
	//CataloguePage cataloguePage= new CataloguePage(driver);
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	List<WebElement> products=	cataloguePage.getProductList();
	
	cataloguePage.addProductToCart(productName);
	CartPage cartPage	=cataloguePage.goToCart();
	
    Boolean match=cartPage.VerifyProductDisplay(productName);
    Assert.assertTrue(match);
     
      
    CheckoutPage checkoutPage=cartPage.goToCheckOut();
    checkoutPage.selectCountry("india");
    ConfirmationPage confirmationPage= checkoutPage.submitOrder();


    String confirmMessage  = confirmationPage.verifyConfiramationMessage();
    Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));  
    driver.close();
		
		
}

}




