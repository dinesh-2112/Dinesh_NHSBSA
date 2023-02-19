package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DOBPage {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    public DOBPage(){
	    	
	    	PageFactory.initElements(driver,this);
	    }
	    
	    WebElement NextButton3 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	    WebElement DOBDate = driver.findElement(By.id("dob-day"));
	    WebElement DOBMonth = driver.findElement(By.id("dob-month"));
	    WebElement DOBYear = driver.findElement(By.id("dob-year"));
	    
	    public void DOBInfo(String Date, String Month, String Year){
	    	
	    	try {
	    	      
	            DOBDate.sendKeys(Date);
	            DOBMonth.sendKeys(Month);	            
	            DOBYear.sendKeys(Year);
	            
	            js.executeScript("arguments[0].scrollIntoView();", NextButton3);
	            NextButton3.click();
	            System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }



}
