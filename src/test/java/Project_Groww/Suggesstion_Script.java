package Project_Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utilities.Base_Test;

public class Suggesstion_Script extends Base_Test {
	
	@Test
	public void Add_To_Cart_From_Recommended_Items() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl.equals("https://www.automationexercise.com/"), true);
		System.out.println(currentUrl);
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='recommended items']"));
		Actions action = new Actions(driver);
		action.scrollToElement(element).perform();
		
		driver.findElement(By.xpath("(//p[text()='Stylish Dress'])[3]//ancestor::div[@class='productinfo text-center']//descendant::a[text()='Add to cart']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Stylish Dress']"));
		Assert.assertEquals(element2.getText().equalsIgnoreCase("Stylish Dress"), true);
		System.out.println(element2.getText());
	}

}
