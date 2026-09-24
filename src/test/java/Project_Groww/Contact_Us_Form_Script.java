package Project_Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Contact_Us_Form_Script extends Base_Test {
	
	@Test
	public void ContactUsForm() {
		
		driver.findElement(By.xpath("//a[text()=' Contact us']")).click();
		WebElement text = driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
		Assert.assertEquals(text.getText().equalsIgnoreCase("Get In Touch"), true);
		System.out.println(text.getText());
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Tom Shelby");
		driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("tomshelby18@gmail.com");
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Automation Testing Project");
		driver.findElement(By.xpath("//textarea[@data-qa='message']")).sendKeys("This form is being tested as part of my Selenium automation testing project. I am validating the Contact Us functionality, including field validation and successful form submission.");
		
		WebElement element = driver.findElement(By.xpath("//input[@name='upload_file']"));
		
		element.sendKeys("C:\\Users\\mathu\\Downloads\\SQL ANSWERS.pdf");
		
		driver.findElement(By.xpath("//input[@data-qa='submit-button']")).click();
		
		driver.switchTo().alert().accept();
		
		WebElement text2 = driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
		Assert.assertEquals(text2.getText().equalsIgnoreCase("Success! Your details have been submitted successfully."), true);
		System.out.println(text2.getText());
		
		driver.findElement(By.xpath("//span[text()=' Home']")).click();
	}

}