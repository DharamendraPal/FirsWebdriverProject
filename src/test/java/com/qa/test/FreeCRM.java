package com.qa.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class FreeCRM {
 
 public WebDriver driver;
 
  @Test
  public void OpenFreeCRM() throws InterruptedException
  {
	  	driver.get("https://www.freecrm.com/index.html");
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("input[@type=\"text\"]")).sendKeys("dharm29");
	  	driver.findElement(By.xpath("input[@type=\"text\"]")).sendKeys("dharm29@123");
	  	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//div[@id='navMenu']//following::li[4]//a[text()='Pipeline']")).click();
	  	
  }
  
  @BeforeClass
  public void beforeClass() 
  {
   
   System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver-v0.16.1-win64");
   driver = new FirefoxDriver();
   
  }
 
  @AfterClass
  public void afterClass() {
   driver.quit();
  }
 
}



