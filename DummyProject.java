package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyProject {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
       WebElement ele= driver.findElement(By.id("user-name"));
         ele.sendKeys("standard_user");
         
       WebElement ele1= driver.findElement(By.id("password"));
          ele1.sendKeys("secret_sauce");
          
       WebElement dri=   driver.findElement(By.id("login-button"));
            dri.click();
            String actual_tit=driver.getTitle();
            if(actual_tit.equals("Swag Labs"))
            {
            	System.out.println("Test pass");
            }else
            {
            	System.out.println("Test Fail");
            }
            
          driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
          
          driver.findElement(By.id("add-to-cart")).click();
          driver.navigate().back();
          
          driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Bike Light']")).click();
          driver.findElement(By.id("add-to-cart")).click();
          driver.navigate().back();
          
           
          Select option= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
        
          option.selectByVisibleText("Price (low to high)");
        
          
          driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
          driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
          driver.findElement(By.id("checkout")).click();
          
          driver.findElement(By.id("first-name")).sendKeys("Rahul");
          driver.findElement(By.id("last-name")).sendKeys("Yadav");   
          driver.findElement(By.id("postal-code")).sendKeys("Lucknow");
          
          driver.findElement(By.id("continue")).click();
          driver.findElement(By.id("finish")).click();
          driver.findElement(By.id("back-to-products")).click();
          driver.close();
          
          
          
          
          
          
          
	}

}
