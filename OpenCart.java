package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenCart {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");

		driver.findElement(By.name("firstname")).sendKeys("Malarvizhi");
		driver.findElement(By.name("lastname")).sendKeys("Nirmal");	
		Select country = new Select(driver.findElement(By.id("input-country")));
		country.selectByVisibleText("India");
		
	}

}
