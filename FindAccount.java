package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
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

//		 * 6. Click on Find Accounts
		driver.findElement(By.xpath("//a[contains(text(), 'Find Accounts')]")).click();
				
//		 * 7. Enter AccountName as "Credit Limited Account" 
		driver.findElement(By.xpath("//label[contains(text(),'Account ID:')]/../..//input[@name='accountName']")).sendKeys("Credit Limited Account");

//		 * 8. Click on Find Accounts using xpath Locator
		driver.findElement(By.xpath("//label[contains(text(),'Account ID:')]/../..//input[@name='accountName']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Find Accounts')]")).click();
	Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'col-groupName')]//a[contains(text(),'Credit Limited Account')]")).click();
				
//		 * 9. Click on the edit Button
		driver.findElement(By.linkText("Edit")).click();

//		 * 10. Get the Text of Account Name and verify 
		String accName= driver.findElement(By.xpath("//input[@id='accountName']")).getAttribute("value");
if (accName.equals("Credit Limited Account"))
	System.out.println("Account Verified: "+ accName);

//		 * 11. Get the Text of Description
String description=driver.findElement(By.xpath("//textarea[@name='description']")).getText();
System.out.println("Description: "+ description);

//		 * 12. Get the title of the page and verify it.
String title= driver.getTitle();
if(title.equals("Edit Account | opentaps CRM"))
		System.out.println("Title "+title);
driver.close();
		
		
	}


}
