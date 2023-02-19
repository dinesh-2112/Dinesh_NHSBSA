package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OtherConditionsPage {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    public OtherConditionsPage(){
	    	
	    	PageFactory.initElements(driver,this);
	    }
	    
	    WebElement NextButton9 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	     
	    public void OtherConditionsInfo(String otherconditions){
	    	
	    	try {
	    	      
	    	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    		
	        WebElement OtherConditionsInformation = driver.findElement(By.xpath("//*[@value="+otherconditions+"]"));
	        OtherConditionsInformation.click();
	        System.out.println("Other Conditions Clicked");
	        
	        js.executeScript("arguments[0].scrollIntoView();", NextButton9);
	        NextButton9.click();
	        System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }



}
