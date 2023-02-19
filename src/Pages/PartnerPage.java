package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PartnerPage {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    public PartnerPage(){
	    	
	    	PageFactory.initElements(driver,this);
	    }
	    
	    WebElement NextButton4 = driver.findElement(By.xpath("//*[@id=\"next-button\"]"));
	     
	    public void PartnerInfo(String partner){
	    	
	    	try {
	    	      
	        WebElement Partner = driver.findElement(By.xpath("//*[@value="+partner+"]"));
	        Partner.click();
	        System.out.println("Partner Info Clicked");
	        
	        js.executeScript("arguments[0].scrollIntoView();", NextButton4);
	        NextButton4.click();
	        System.out.println("Next Button Clicked");
	        
	    	}
	    	
	    	catch (Exception e) {
	    	      System.out.println(e);
	    	    }
	    }


	

}
