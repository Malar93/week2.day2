package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) 
	{
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();

//1. Launch URL "http://leaftaps.com/opentaps/control/login"
driver.get("http://leaftaps.com/opentaps/control/login");
		 
		 // 2. Enter UserName and Password Using Id Locator
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");		  
		 
		 // 3. Click on Login Button using Class Locator
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		  //4. Click on CRM/SFA Link
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 // 5. Click on Leads Button
		 driver.findElement(By.linkText("Leads")).click(); 
		  
		// 6. Click on create Lead Button
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		// 7. Enter CompanyName using id Locator
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Orion Innovations");
		 
		// 8. Enter FirstName using id Locator
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Heena");
		 
//		  9. Enter LastName using id Locator
				 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nousheen");
		 
//	 10. Click on create Lead Button Using name Locator
				 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 
//	 11. Get the Title of the resulting Page
				 String leadID = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
				    System.out.println(leadID);
		 
// 12.close the browser
				    driver.close();
		
	}


}
