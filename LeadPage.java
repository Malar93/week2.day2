package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class LeadPage {

	public static void main(String[] args)
	{
		/* Open a chrome browser
		2. Load the URL: http://leaftaps.com/opentaps/control/main
			3. Enter Username as Demosalesmanager
			4. Enter Password as crmsfa
			5. Click on  Login Button
			6. Click on CRM/SFA link
			7. Click on Leads tab
			8. Click on Create Lead Menu
			9. Enter company name, first name, last name
			10. Click on Create Lead button
			11. Get the Lead ID text and print*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");		  
	    driver.findElement(By.className("decorativeSubmit")).click();
	    String text = driver.findElement(By.tagName("h2")).getText();
	    System.out.println(text);
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Orion Innovations");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Heena");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Nousheen");
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    String leadID = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
	    System.out.println(leadID);
	    driver.close();
}

}
