package Project_Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Register_Script extends Base_Test {
	
	@Test
	
	public void Register_Module() {
		
		
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		
		WebElement text = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
		

		Assert.assertEquals(text.getText().equalsIgnoreCase("New User Signup!"), true);
		System.out.println(text.getText());
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Tom Shelby");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("tomshelby18@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		WebElement text2 = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
		
		Assert.assertEquals(text2.getText().equalsIgnoreCase("Enter Account Information"), true);
		System.out.println(text2.getText());
		
		driver.findElement(By.xpath("//input[@value='Mr']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("tomshelby18");
		
		WebElement dropdown = driver.findElement(By.id("days"));
		Select select = new Select(dropdown);
		
		select.selectByValue("18");
		
		WebElement dropdown2 = driver.findElement(By.id("months"));
		Select select2 = new Select(dropdown2);
		
		select2.selectByValue("4");
		
		WebElement dropdown3 = driver.findElement(By.id("years"));
		Select select3 = new Select(dropdown3);
		
		select3.selectByValue("2004");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		
		driver.findElement(By.xpath("//input[@data-qa='first_name']")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@data-qa='last_name']")).sendKeys("Shelby");
		driver.findElement(By.xpath("//input[@data-qa='company']")).sendKeys("Oracle");
		driver.findElement(By.id("address1")).sendKeys("F-01/02, First Floor, Salcon Rasvillas, D-1, District Centre, Saket, New Delhi - 110017");
		driver.findElement(By.id("state")).sendKeys("New Delhi");
		driver.findElement(By.id("city")).sendKeys("Saket");
		driver.findElement(By.id("zipcode")).sendKeys("110017");
		driver.findElement(By.id("mobile_number")).sendKeys("7708834470");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		
		WebElement text3 = driver.findElement(By.xpath("//b[text()='Account Created!']"));
		Assert.assertEquals(text3.getText().equalsIgnoreCase("Account Created!"), true);
		System.out.println(text3.getText());
		
		
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
		WebElement text4 = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
		Assert.assertEquals(text4.getText().equalsIgnoreCase("Logged in as"), true);
		System.out.println(text4.getText());
		
		
	}
	

}
