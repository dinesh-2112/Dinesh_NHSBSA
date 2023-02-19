package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SavingsInfoPage {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    public SavingsInfoPage(){
	    	
	    	PageFactory.initElements(driver,this);
	    }
	    
	    WebElement NextButton12 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	     
	    public void SavingsInfo(String savings){
	    	
	    	try {
	    	      
	        WebElement Savings = driver.findElement(By.xpath("//*[@value="+savings+"]"));
	        Savings.click();
	        System.out.println("Savings Clicked");
	        
	        js.executeScript("arguments[0].scrollIntoView();", NextButton12);
	        NextButton12.click();
	        System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }



}
