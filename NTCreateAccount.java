package week2.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");

//		 * 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		
//		 * 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

//		 * 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
//		 * 5. Click on Accounts Button
		driver.findElement(By.xpath("//a[contains(text(), 'Accounts')]")).click();
		
//		 * 6. Click on Create Account
		 driver.findElement(By.xpath("//a[contains(text(), 'Create Account')]")).click();
		 
//		 * 7. Select preferred currency as Indian Rupee using SelectByValue
		 Select rupee = new Select(driver.findElement(By.id("currencyUomId")));
		 rupee.selectByValue("INR");
		 
//		 * 8. Enter the Description text as "NRI Account"
		 driver.findElement(By.xpath("//textarea[@name= 'description']")).sendKeys("NRI Account");
		 
//		 * 9. Enter LocalName Field Using Xpath Locator
		 driver.findElement(By.xpath("//input[@name= 'groupNameLocal']")).sendKeys("LOCAL");
		 
//		 * 10. Enter SiteName Field Using Xpath Locator
		 driver.findElement(By.xpath("//input[@name= 'officeSiteName']")).sendKeys("SITE");

//		 * 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		 driver.findElement(By.xpath("//span[contains(text(),'Annual Revenue')]/../..//input[@class='inputBox']")).sendKeys("990000");
		 
//		 * 17. Click on Create Account using Xpath Locator
		 driver.findElement(By.xpath("//input[@type= 'submit']")).click();
		 
//		 * 18. Get the Text of Error Message Displayed (hint: Red Texts)
		 String errorMsg = driver.findElement(By.xpath("//div[@class='messages']")).getText();
		 System.out.println(errorMsg);
//         close the browser
		driver.close();
	}

}
